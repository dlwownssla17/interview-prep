# in place using first row and first column to mark presence of zeros
def set_zeros(matrix):
    if len(matrix) == 0 or len(matrix[0]) == 0:
        return

    first_row = first_row_has_zeros(matrix)
    first_column = first_column_has_zeros(matrix)

    mark_zeros(matrix)

    for j in xrange(1, len(matrix[0])):
        if matrix[0][j] == 0:
            set_column_zeros(matrix, j)
    for i in xrange(1, len(matrix)):
        if matrix[i][0] == 0:
            set_row_zeros(matrix, i)

    if first_row:
        set_row_zeros(matrix, 0)
    if first_column:
        set_column_zeros(matrix, 0)


# check if first row has zeros
def first_row_has_zeros(matrix):
    for j in xrange(len(matrix[0])):
        if matrix[0][j] == 0:
            return True
    return False


# check if first column has zeros
def first_column_has_zeros(matrix):
    for i in xrange(len(matrix)):
        if matrix[i][0] == 0:
            return True
    return False


# mark zeros in first row and first column
def mark_zeros(matrix):
    for i in xrange(1, len(matrix)):
        for j in xrange(1, len(matrix[i])):
            if matrix[i][j] == 0:
                matrix[0][j] = 0
                matrix[i][0] = 0


# set given row to zeros
def set_row_zeros(matrix, row):
    for j in xrange(len(matrix[0])):
        matrix[row][j] = 0


# set given column to zeros
def set_column_zeros(matrix, column):
    for i in xrange(len(matrix)):
        matrix[i][column] = 0
