n, a, b = map(int, input().split())

position = 0
for _ in range(n):
    s, d = input().split()
    position += min(max(a, int(d)), b) * (-1 if s == "West" else 1)

if position > 0:
    print("East", position)
elif position < 0:
    print("West", -position)
else:
    print(0)
