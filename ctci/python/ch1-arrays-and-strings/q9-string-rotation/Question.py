# check if substring of duplicated string
def is_rotation(s1, s2):
    return is_substring(s1 + s1, s2)


# check if substring
def is_substring(s1, s2):
    return s2 in s1
