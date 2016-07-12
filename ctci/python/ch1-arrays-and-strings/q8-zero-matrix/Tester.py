import unittest
from Question import *


class Tester(unittest.TestCase):

    def test_set_zeros(self):
        matrix_a = [[1]]
        zeroed_matrix_a = [[1]]
        set_zeros(matrix_a)
        self.assertEquals(matrix_a, zeroed_matrix_a)
        matrix_b = [[0]]
        zeroed_matrix_b = [[0]]
        set_zeros(matrix_b)
        self.assertEquals(matrix_b, zeroed_matrix_b)
        matrix_c = [[0, 1]]
        zeroed_matrix_c = [[0, 0]]
        set_zeros(matrix_c)
        self.assertEquals(matrix_c, zeroed_matrix_c)
        matrix_d = [[1, 1, 1], [1, 1, 0]]
        zeroed_matrix_d = [[1, 1, 0], [0, 0, 0]]
        set_zeros(matrix_d)
        self.assertEquals(matrix_d, zeroed_matrix_d)
        matrix_e = [[1, 0, 1, 1, 1], [1, 1, 1, 1, 1], [1, 1, 1, 0, 1],
                    [1, 1, 1, 1, 1], [1, 1, 1, 1, 1], [1, 1, 1, 0, 1]]
        zeroed_matrix_e = [[0, 0, 0, 0, 0], [1, 0, 1, 0, 1], [0, 0, 0, 0, 0],
                           [1, 0, 1, 0, 1], [1, 0, 1, 0, 1], [0, 0, 0, 0, 0]]
        set_zeros(matrix_e)
        self.assertEquals(matrix_e, zeroed_matrix_e)

if __name__ == "__main__":
    unittest.main()
