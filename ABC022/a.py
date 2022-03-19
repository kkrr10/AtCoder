n, s, t = map(int, input().split())
w = int(input())
ans = 1 if s <= w <= t else 0
for _ in range(n-1):
    w += int(input())
    ans += 1 if s <= w <= t else 0
print(ans)
