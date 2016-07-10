# iterate backwards using char array
def urlify(s, length):
    num_spaces = s[:length].count(' ')
    url_index = length + 2 * num_spaces - 1
    for i in xrange(length - 1, -1, -1):
        if s[i] == ' ':
            s[url_index] = '0'
            s[url_index - 1] = '2'
            s[url_index - 2] = '%'
            url_index -= 3
        else:
            s[url_index] = s[i]
            url_index -= 1