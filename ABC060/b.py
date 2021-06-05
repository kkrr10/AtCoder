a, b, c = map(int, input().split())
s = set()

for i in range(1, b+1):
    rem = i * a % b
    if rem == c:
        print("YES")
        exit()
    if rem in s:
        break
    s.add(rem)

print("NO")
