# use a bit vector and assume lowercase alphabets (i.e. 26 characters)
def is_unique_no_additional_data_structure(s):
    if len(s) > 26:
        return False

    exists = 0
    ord_a = ord('a')
    for c in s:
        bit_mask = 1 << (ord(c) - ord_a)
        if (exists & bit_mask) > 0:
            return False
        exists |= bit_mask
    return True
