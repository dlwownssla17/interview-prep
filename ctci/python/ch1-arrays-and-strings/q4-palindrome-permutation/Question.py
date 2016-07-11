# get character value
def get_char_value(c):
    lower_c, a, z = ord(c.lower()), ord('a'), ord('z')
    return lower_c - a if a <= lower_c <= z else -1


# use a bit vector and assume alphabets where lowercase == uppercase (i.e. 26 characters)
def is_permutation_of_palindrome(s):
    counts_odd = 0
    for c in s:
        shift = get_char_value(c)
        if shift != -1:
            bit_mask = 1 << shift
            counts_odd ^= bit_mask
    return (counts_odd & (counts_odd - 1)) == 0