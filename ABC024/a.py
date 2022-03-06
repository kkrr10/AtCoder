a, b, c, k = map(int, input().split())
s, t = map(int, input().split())
ans = a * s + b * t
print(ans - c * (s + t) if s + t >= k else ans)
