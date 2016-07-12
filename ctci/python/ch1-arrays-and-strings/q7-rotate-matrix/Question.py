# in place using temp variable and layer-based iteration
def rotate(matrix):
    length = len(matrix)
    for i in xrange(length / 2):
        for j in xrange(i, length - 1 - i):
            temp = matrix[i][j]
            matrix[i][j] = matrix[length - 1 - j][i]
            matrix[length - 1 - j][i] = matrix[length - 1 - i][length - 1 - j]
            matrix[length - 1 - i][length - 1 - j] = matrix[j][length - 1 - i]
            matrix[j][length - 1 - i] = temp
