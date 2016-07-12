import unittest
from Question import *


class Tester(unittest.TestCase):

    def test_one_edit_away(self):
        self.assertTrue(one_edit_away("pale", "ple"))
        self.assertTrue(one_edit_away("pales", "pale"))
        self.assertTrue(one_edit_away("pale", "bale"))
        self.assertTrue(one_edit_away("pale", "pale"))
        self.assertTrue(one_edit_away("pale", "pane"))
        self.assertTrue(one_edit_away("pale", "paler"))
        self.assertTrue(one_edit_away("pale", "phale"))
        self.assertTrue(one_edit_away("", ""))
        self.assertFalse(one_edit_away("pale", "bake"))
        self.assertFalse(one_edit_away("pale", "palest"))
        self.assertFalse(one_edit_away("pale", "a"))

if __name__ == "__main__":
    unittest.main()