input()
a = list(map(int, input().split()))
ans = 0
for ai in a:
    if ai % 6 in [2, 4]:
        ans += 1
    elif ai % 6 == 5:
        ans += 2
    elif ai % 6 == 0:
        ans += 3
print(ans)
