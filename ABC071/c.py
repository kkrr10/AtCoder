n = int(input())
a = sorted(list(map(int, input().split())), reverse=True)

ok = []
i = 0

while i < n-1:
    if a[i] == a[i+1]:
        ok.append(a[i])
        i += 1
    i += 1

print(0 if len(ok) < 2 else ok[0]*ok[1])
