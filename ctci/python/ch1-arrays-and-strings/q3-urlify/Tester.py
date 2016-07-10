import unittest
from Question import *


class Tester(unittest.TestCase):

    def test_urlify(self):
        a = list("Mr John Smith    ")
        urlify(a, 13)
        self.assertEquals(a, list("Mr%20John%20Smith"))
        b = list("Mr John Smith       ")
        urlify(b, 13)
        self.assertEquals(b, list("Mr%20John%20Smith   "))
        c = list("Mr John Smith       ")
        urlify(c, 14)
        self.assertEquals(c, list("Mr%20John%20Smith%20"))
        d = list("I  love   you!              ")
        urlify(d, 15)
        self.assertEquals(d, list("I%20%20love%20%20%20you!%20 "))
        e = list("   ")
        urlify(e, 1)
        self.assertEquals(e, list("%20"))

if __name__ == "__main__":
    unittest.main()