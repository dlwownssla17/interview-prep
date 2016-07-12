import unittest
from Question import *


class Tester(unittest.TestCase):

    def test_compress(self):
        self.assertEquals(compress("aabcccccaaa"), "a2b1c5a3")
        self.assertEquals(compress(""), "")
        self.assertEquals(compress("a"), "a")
        self.assertEquals(compress("aa"), "aa")
        self.assertEquals(compress("aaa"), "a3")
        self.assertEquals(compress("AAaaaabbbBCcc"), "A2a4b3B1C1c2")
        self.assertEquals(compress("aaaaaaaaaaaa"), "a12")

if __name__ == "__main__":
    unittest.main()
