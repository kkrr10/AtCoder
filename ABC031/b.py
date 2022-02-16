l, h = map(int, input().split())
for _ in range(int(input())):
    a = int(input())
    print(-1 if a > h else max(l - a, 0))
