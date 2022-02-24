a, b, c, d = map(int, input().split())
print("DRAW" if b * c == d * a else "TAKAHASHI" if b * c > d * a else "AOKI")
