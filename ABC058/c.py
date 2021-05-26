n = int(input())
ss = [input() for _ in range(n)]

alpha = [chr(c) for c in range(97, 97+26)]
ans = ""

for c in alpha:
    cnt = 100
    for s in ss:
        cnt = min(cnt, s.count(c))
    ans += c * cnt

print(ans)
