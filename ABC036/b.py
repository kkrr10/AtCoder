n = int(input())
s = [input() for _ in range(n)]

for i in range(n):
    for j in range(n):
        print(s[n-j-1][i], end="")
    print()
