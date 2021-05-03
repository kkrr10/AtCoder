n = int(input())
s = input()

W = [0]
E = [0]

for i in range(n):
    W.append(W[-1] + (1 if s[i] == 'W' else 0))
    E.append(E[-1] + (1 if s[n-i-1] == 'E' else 0))

ans = 10 ** 6

for i in range(n):
    ans = min(ans, W[i] + E[n-1-i])

print(ans)
