# compare string lengths to use only one iteration
def one_edit_away(s1, s2):
    if abs(len(s1) - len(s2)) > 1:
        return False

    if len(s1) < len(s2):
        return one_edit_away_helper(s1, s2, False)
    elif len(s1) > len(s2):
        return one_edit_away_helper(s2, s1, False)
    else:
        return one_edit_away_helper(s1, s2, True)


# helper fuction common for all three cases (insert, remove, replace)
def one_edit_away_helper(shorter, longer, for_replace):
    found = False
    for i in xrange(len(shorter)):
        if shorter[i] != longer[i + 1 if not for_replace and found else i]:
            if found:
                return False
            found = True
    return True
