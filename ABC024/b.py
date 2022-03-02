n, t = map(int, input().split())
table = [0] * (10**6 + 10**5)
for _ in range(n):
    table[int(input())] = t

for i in range(1, len(table)):
    table[i] = max(table[i], table[i-1] - 1)

print(sum([v > 0 for v in table]))
