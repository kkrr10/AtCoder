n, k = map(int, input().split())
h = sorted(list(map(int, input().split())))

print(sum(h[:max(n-k, 0)]))
