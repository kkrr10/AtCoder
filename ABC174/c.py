k = int(input())
a = 0

for i in range(1, k+1):
    a *= 10
    a += 7
    a %= k
    if a == 0:
        print(i)
        exit()

print(-1)
