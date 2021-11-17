from collections import deque


n, m = map(int, input().split())
graph = [[] for _ in range(n)]
for _ in range(m):
    a, b = map(int, input().split())
    graph[a-1].append(b-1)
    graph[b-1].append(a-1)

ans = 0
visited = [False for _ in range(n)]


def bfs(start):
    que = deque()
    visited[start] = True
    que.append(start)
    while que:
        current = que.popleft()
        for next in graph[current]:
            if visited[next]:
                continue
            visited[next] = True
            que.append(next)


for v in range(n):
    if visited[v]:
        continue
    ans += 1
    bfs(v)

print(ans-1)
