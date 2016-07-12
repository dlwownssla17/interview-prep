import unittest
from Question import *


class Tester(unittest.TestCase):

    def test_is_rotation(self):
        self.assertTrue(is_rotation("erbottlewat", "waterbottle"))
        self.assertTrue(is_rotation("", ""))
        self.assertTrue(is_rotation("A", "A"))
        self.assertTrue(is_rotation("BABA", "ABAB"))
        self.assertTrue(is_rotation("asdfg", "asdfg"))

if __name__ == "__main__":
    unittest.main()
