# assume ASCII
def is_unique(s):
    if len(s) > 128:
        return False

    exists = [False for _ in xrange(128)]
    for c in s:
        if exists[ord(c)]:
            return False
        exists[ord(c)] = True
    return True


# no assumption
def is_unique_no_assumption(s):
    exists = set()
    for c in s:
        if c in exists:
            return False
        exists.add(c)
    return True
