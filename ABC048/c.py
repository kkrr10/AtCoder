n, x = map(int, input().split())
a = list(map(int, input().split()))

all = sum(a)

for i in range(n-1):
    if a[i] + a[i+1] > x:
        a[i+1] = max(0, x-a[i])
        a[i] -= max(0, a[i]+a[i+1]-x)

print(all - sum(a))
