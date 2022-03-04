a = int(input())
ans = -1
for x in range(1, a):
    ans = max(ans, x * (a - x))
print(ans)
