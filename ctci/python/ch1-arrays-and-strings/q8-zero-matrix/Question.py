# in place using first row and first column to mark presence of zeros
def set_zeros(matrix):
    first_row_zeros = mark_zeros(matrix)
    if len(matrix) > 0:
        set_column_zeros(matrix)
    set_row_zeros(matrix, first_row_zeros)


# mark presence of zeros
def mark_zeros(matrix):
    first_row_zeros = False
    for i in xrange(len(matrix)):
        for j in xrange(len(matrix[0])):
            if matrix[i][j] == 0:
                if i != 0:
                    matrix[i][0] = 0
                else:
                    first_row_zeros = True
                matrix[0][j] = 0
    return first_row_zeros


# set marked columns as zeros
def set_column_zeros(matrix):
    for j in xrange(len(matrix[0])):
        if matrix[0][j] == 0:
            for i in xrange(len(matrix)):
                matrix[i][j] = 0


# set marked rows as zeros
def set_row_zeros(matrix, first_row_zeros):
    for i in xrange(len(matrix)):
        if (i == 0 and first_row_zeros) or matrix[i][0] == 0:
            for j in xrange(len(matrix[0])):
                matrix[i][j] = 0
