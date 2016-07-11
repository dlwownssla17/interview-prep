import unittest
from Question import *


class Tester(unittest.TestCase):

    def test_is_permutation_of_palindrome(self):
        self.assertTrue(is_permutation_of_palindrome("Tact Coa"))
        self.assertTrue(is_permutation_of_palindrome("abba"))
        self.assertTrue(is_permutation_of_palindrome("   "))
        self.assertTrue(is_permutation_of_palindrome("RaceCar!"))
        self.assertFalse(is_permutation_of_palindrome("Tact Coat"))

if __name__ == "__main__":
    unittest.main()