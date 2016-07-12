import unittest
from Question import *


class Tester(unittest.TestCase):

    def test_rotate(self):
        matrix_a = self.counting_matrix(0)
        rotated_matrix_a = []
        rotate(matrix_a)
        self.assertEquals(matrix_a, rotated_matrix_a)
        matrix_b = self.counting_matrix(1)
        rotated_matrix_b = [[0]]
        rotate(matrix_b)
        self.assertEquals(matrix_b, rotated_matrix_b)
        matrix_c = self.counting_matrix(2)
        rotated_matrix_c = [[2, 0], [3, 1]]
        rotate(matrix_c)
        self.assertEquals(matrix_c, rotated_matrix_c)
        matrix_d = self.counting_matrix(3)
        rotated_matrix_d = [[6, 3, 0], [7, 4, 1], [8, 5, 2]]
        rotate(matrix_d)
        self.assertEquals(matrix_d, rotated_matrix_d)
        matrix_e = self.counting_matrix(6)
        rotated_matrix_e = [[30, 24, 18, 12, 6, 0], [31, 25, 19, 13, 7, 1], [32, 26, 20, 14, 8, 2], \
            [33, 27, 21, 15, 9, 3], [34, 28, 22, 16, 10, 4], [35, 29, 23, 17, 11, 5]]
        rotate(matrix_e)
        self.assertEquals(matrix_e, rotated_matrix_e)

    def counting_matrix(self, N):
        return [[N * i + j for j in xrange(N)] for i in xrange(N)]

if __name__ == "__main__":
    unittest.main()