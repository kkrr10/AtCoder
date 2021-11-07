class UnionFind(size: Int) {
    private val parent = Array(size) { -1 }
    private var num = size

    fun root(x: Int): Int {
        if (parent[x] < 0) return x
        parent[x] = root(parent[x])
        return parent[x]
    }

    fun isSame(x: Int, y: Int) = root(x) == root(y)

    fun unite(_x: Int, _y: Int): Boolean {
        val x = root(_x)
        val y = root(_y)
        if (x == y) return false
        if (parent[x] > parent[y]) {
            val temp = parent[x]
            parent[x] = parent[y]
            parent[y] = temp
        }
        parent[x] += parent[y]
        parent[y] = x
        num--
        return true
    }

    fun size(x: Int) = -parent[root(x)]

    fun num() = num
}


fun main() {
    val dy = listOf(0, -1, 0, 1)
    val dx = listOf(1, 0, -1, 0)
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    val table = Array(h) { BooleanArray(w) }
    val uf = UnionFind(h*w)
    repeat(readLine()!!.toInt()) {
        val q = readLine()!!.split(" ").map { it.toInt() - 1 }
        when (q[0]) {
            0 -> {
                table[q[1]][q[2]] = true
                for (i in dy.indices) {
                    val ny = q[1] + dy[i]
                    val nx = q[2] + dx[i]
                    if (ny in 0..(h-1) && nx in 0..(w-1) && table[ny][nx]) uf.unite(q[1]*w + q[2], ny*w + nx)
                }
            }
            1 -> println(if (table[q[1]][q[2]] && uf.isSame(q[1]*w + q[2], q[3]*w + q[4])) "Yes" else "No")
        }
    }
}
