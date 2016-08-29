package q8_draw_line;

/**
 * Created by jjlee on 8/28/16.
 */
public class Question {
    private static int BYTE_LENGTH = 8;

    /* use bitmasks for possibly the leftmost and rightmost indices and set the rest to 0xFF
       (a little different from provided solution that is worth checking) */
    public static void drawLine(byte[] screen, int width, int x1, int x2, int y) {
        int numBytesPerRow = width / BYTE_LENGTH;
        int height = screen.length / numBytesPerRow;
        if (x1 < 0 || x1 >= width || x2 < 0 || x2 >= width || y < 0 || y >= height) throw new IndexOutOfBoundsException();
        int offset = numBytesPerRow * y;
        int from = Math.min(x1, x2);
        int to = Math.max(x1, x2);
        int fromIndex = offset + from / BYTE_LENGTH;
        int toIndex = offset + to / BYTE_LENGTH;
        boolean sameIndex = fromIndex == toIndex;
        int leftFromBit = from % BYTE_LENGTH;
        int rightToBit = to % BYTE_LENGTH;

        fillMiddle(screen, fromIndex + (leftFromBit == 0 ? 0 : 1), toIndex - (rightToBit == BYTE_LENGTH - 1 ? 0 : 1));
        if (sameIndex) {
            fillPartial(screen, fromIndex, leftFromBit, rightToBit);
        }
        else {
            fillPartial(screen, fromIndex, leftFromBit, BYTE_LENGTH - 1);
            fillPartial(screen, toIndex, 0, rightToBit);
        }
    }

    private static void fillPartial(byte[] screen, int index, int fromBit, int toBit) {
        if (fromBit == 0 && toBit == BYTE_LENGTH - 1) return;
        int bitMask = ((1 << (BYTE_LENGTH - fromBit)) - 1) & (0xFF << BYTE_LENGTH - 1 - toBit);
        screen[index] |= bitMask;
    }

    private static void fillMiddle(byte[] screen, int fromIndex, int toIndex) {
        for (int i = fromIndex; i <= toIndex; i++) {
            screen[i] = (byte) 0xFF;
        }
    }

    public static void printScreen(byte[] screen, int width) {
        int numBytesPerRow = width / BYTE_LENGTH;
        for (int i = 0; i < screen.length; i++) {
            int b = screen[i];
            if (b == 0) {
                System.out.print("--------");
            }
            else if (b == 0xFF) {
                System.out.print("oooooooo");
            }
            else {
                StringBuilder s = new StringBuilder();
                int current = b;
                for (int j = 0; j < BYTE_LENGTH; j++) {
                    if ((current & 1) == 1) s.append('o');
                    else s.append('-');
                    current >>>= 1;
                }
                System.out.print(s.reverse().toString());
            }

            if (i % numBytesPerRow == numBytesPerRow - 1) System.out.println();
        }
    }
}
