n, m = map(int, input().split())
deg_m = m / 60 * 360
deg_n = (n % 12) / 12 * 360 + deg_m / 12
diff = max(deg_n - deg_m, deg_m - deg_n)
print(min(diff, 360 - diff))
