from collections import defaultdict


# assume ASCII
def check_permutation(s1, s2):
    if len(s1) != len(s2):
        return False

    counts = [0 for _ in xrange(128)]
    for i in xrange(len(s1)):
        counts[ord(s1[i])] += 1
        counts[ord(s2[i])] -= 1
    for count in counts:
        if count != 0:
            return False
    return True


# no assumption
def check_permutation_no_assumption(s1, s2):
    if len(s1) != len(s2):
        return False

    counts = defaultdict(int)
    for i in xrange(len(s1)):
        counts[s1[i]] += 1
        counts[s2[i]] -= 1
    for count in counts.values():
        if count != 0:
            return False
    return True
