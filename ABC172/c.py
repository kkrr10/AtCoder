import bisect


n, m, k = map(int, input().split())
a = [0]
b = [0]
for i in input().split():
    a.append(a[-1] + int(i))
for i in input().split():
    b.append(b[-1] + int(i))
mx = 0

for i in range(len(a)):
    if a[i] > k:
        break
    mx = max(mx, i + max(0, bisect.bisect(b, k-a[i]) - 1))

print(mx)
