
class UnionFind():

    def __init__(self, size):
        self.num = size
        self.parent = [-1] * size

    def root(self, x):
        if self.parent[x] < 0:
            return x
        self.parent[x] = self.root(self.parent[x])
        return self.parent[x]

    def unite(self, x, y):
        x = self.root(x)
        y = self.root(y)
        if x == y:
            return
        if self.parent[x] > self.parent[y]:
            x, y = y, x
        self.parent[x] += self.parent[y]
        self.parent[y] = x
        self.num -= 1


n, m = map(int, input().split())
uf = UnionFind(n)
for _ in range(m):
    a, b = map(int, input().split())
    uf.unite(a-1, b-1)

print(uf.num - 1)
