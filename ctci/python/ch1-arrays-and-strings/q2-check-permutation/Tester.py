import unittest
from QuestionA import *
from QuestionB import *


class Tester(unittest.TestCase):

    def test_check_permutation(self):
        self.assertFalse(check_permutation("asdf", "asdfg"))
        self.assertFalse(check_permutation("asdf", "asdg"))
        self.assertTrue(check_permutation("asdf", "asdf"))
        self.assertTrue(check_permutation("asdf", "fads"))
        self.assertTrue(check_permutation("asriel dreemurr", "serial murderer"))

    def test_check_permutation_no_assumption(self):
        self.assertFalse(check_permutation_no_assumption("asdf", "asdfg"))
        self.assertFalse(check_permutation_no_assumption("asdf", "asdg"))
        self.assertTrue(check_permutation_no_assumption("asdf", "asdf"))
        self.assertTrue(check_permutation_no_assumption("asdf", "fads"))
        self.assertTrue(check_permutation_no_assumption("asriel dreemurr", "serial murderer"))

    def test_check_permutation_with_sort(self):
        self.assertFalse(check_permutation_with_sort("asdf", "asdfg"))
        self.assertFalse(check_permutation_with_sort("asdf", "asdg"))
        self.assertTrue(check_permutation_with_sort("asdf", "asdf"))
        self.assertTrue(check_permutation_with_sort("asdf", "fads"))
        self.assertTrue(check_permutation_with_sort("asriel dreemurr", "serial murderer"))

if __name__ == "__main__":
    unittest.main()