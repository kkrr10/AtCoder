a = int(input())
b = int(input())
print(min((a - b + 10) % 10, (b - a + 10) % 10))
