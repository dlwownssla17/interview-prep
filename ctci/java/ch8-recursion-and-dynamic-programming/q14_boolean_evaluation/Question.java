package q14_boolean_evaluation;

import java.util.HashMap;

/**
 * Created by jjlee on 9/12/16.
 */
public class Question {
    /* compute the number of ways of parenthesizing the given expression composed of 0, 1, &, |, and ^ such that it
       evaluates to given result (true or false), by breaking the expression down into subexpressions to the left and
       right (i.e. subproblems) and memoizing for both true and false
       (a little different from book solution, because this solution memoizes counts for both true and false after
       one computation) */
    public static int countEval(String expr, boolean result) {
        if (expr.isEmpty()) return 0;
        HashMap<String, int[]> counts = new HashMap<>();
        fillCounts(expr, counts);
        return counts.get(expr)[result ? 0 : 1];
    }

    private static void fillCounts(String expr, HashMap<String, int[]> counts) {
        if (expr.length() == 1) {
            int operand = Integer.parseInt(expr);
            counts.put(expr, new int[]{ operand, 1 - operand });
            return;
        }
        int trueTotal = 0;
        int falseTotal = 0;
        for (int i = 1; i < expr.length(); i += 2) {
            char operator = expr.charAt(i);
            String opLeft = expr.substring(0, i);
            String opRight = expr.substring(i + 1);
            if (!counts.containsKey(opLeft)) fillCounts(opLeft, counts);
            if (!counts.containsKey(opRight)) fillCounts(opRight, counts);
            int[] countsLeft = counts.get(opLeft);
            int[] countsRight = counts.get(opRight);
            int trueLeft = countsLeft[0];
            int falseLeft = countsLeft[1];
            int trueRight = countsRight[0];
            int falseRight = countsRight[1];
            int totalThis = (trueLeft + falseLeft) * (trueRight + falseRight);
            int trueThis = 0;
            int falseThis = 0;
            if (operator == '&') {
                trueThis = trueLeft * trueRight;
                falseThis = totalThis - trueThis;
            } else if (operator == '|') {
                falseThis = falseLeft * falseRight;
                trueThis = totalThis - falseThis;
            } else {
                trueThis = trueLeft * falseRight + falseLeft * trueRight;
                falseThis = totalThis - trueThis;
            }
            trueTotal += trueThis;
            falseTotal += falseThis;
        }
        counts.put(expr, new int[]{ trueTotal, falseTotal });
    }
}
