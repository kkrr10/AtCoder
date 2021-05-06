n, m = map(int, input().split())
print(n*(n-1)//2 + m*(m-1)//2)

# ans = 0
# for i in range(1, n):
#     ans += n - i
# for i in range(1, m):
#     ans += m - i
# print(ans)
