n = int(input())
fs = [list(map(int, input().split())) for i in range(n)]
ps = [list(map(int, input().split())) for i in range(n)]

ans = -float('inf')

for i in range(1, 2**10):
    profit = 0
    for shop in range(n):
        c = 0
        for time in range(10):
            if ((i >> time) & 1) and fs[shop][time]:
                c += 1
        profit += ps[shop][c]
    ans = max(ans, profit)

print(int(ans))
