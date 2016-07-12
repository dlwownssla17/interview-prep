# one iteration with neighbor character comparison
def compress(s):
    compressed_list = []
    count_consecutive = 1
    for i in xrange(len(s)):
        if i + 1 < len(s) and s[i] == s[i + 1]:
            count_consecutive += 1
        else:
            compressed_list.append(s[i])
            compressed_list.append(str(count_consecutive))
            count_consecutive = 1
    compressed = ''.join(compressed_list)
    return s if len(compressed) >= len(s) else compressed
