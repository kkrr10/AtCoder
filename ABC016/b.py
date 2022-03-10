a, b, c = map(int, input().split())

if a + b == c:
    print("?" if b == 0 else "+")
elif a - b == c:
    print("-")
else:
    print("!")
