import unittest
from QuestionA import *
from QuestionB import *


class Tester(unittest.TestCase):

    def test_is_unique(self):
        self.assertTrue(is_unique("abcd"))
        self.assertFalse(is_unique("abcb"))
        self.assertTrue(is_unique("123456asdfg7890."))
        self.assertFalse(is_unique(".123456asdfg7890."))

    def test_is_unique_no_assumption(self):
        self.assertTrue(is_unique_no_assumption("abcd"))
        self.assertFalse(is_unique_no_assumption("abcb"))
        self.assertTrue(is_unique_no_assumption("123456asdfg7890."))
        self.assertFalse(is_unique_no_assumption(".123456asdfg7890."))

    def test_is_unique_no_additional_data_structure(self):
        self.assertTrue(is_unique_no_additional_data_structure("abcd"))
        self.assertFalse(is_unique_no_additional_data_structure("abcb"))
        self.assertTrue(is_unique_no_additional_data_structure("something"))
        self.assertFalse(is_unique_no_additional_data_structure("interview"))

if __name__ == "__main__":
    unittest.main()
