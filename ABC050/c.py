n = int(input())
a = list(map(int, input().split()))

table = [0 for _ in range(n)]
table[0] += 1
for num in a:
    table[num] += 1

possible = True
div = (n+1) % 2
for _ in range((n+1)//2):
    if table[div] != 2:
        possible = False
        break
    div += 2

print(pow(2, n//2, 10**9+7) if possible else 0)
