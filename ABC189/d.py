n = int(input())
s = [input() for i in range(n)]


def count_state(idx):
    if idx < 0:
        return 1

    if s[idx] == "AND":
        return count_state(idx-1)
    else:
        return pow(2, idx+1) + count_state(idx-1)


print(count_state(n-1))
