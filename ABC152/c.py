n = int(input())
ps = list(map(int, input().split()))

mn = ps[0]
ans = 0

for i in range(n):
    if ps[i] <= mn:
        ans += 1
        mn = ps[i]

print(ans)
