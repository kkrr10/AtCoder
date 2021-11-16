import sys


sys.setrecursionlimit(10**5)

n, m = map(int, input().split())
graph = [[] for _ in range(n)]
for _ in range(m):
    a, b = map(int, input().split())
    graph[a-1].append(b-1)
    graph[b-1].append(a-1)

ans = 0
visited = [False for _ in range(n)]


def dfs(current):
    if visited[current]:
        return
    visited[current] = True
    for next in graph[current]:
        dfs(next)


for v in range(n):
    if visited[v]:
        continue
    ans += 1
    dfs(v)

print(ans-1)
