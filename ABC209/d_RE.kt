fun main() {
    val (n, q) = readLine()!!.split(" ").map { it.toInt() }
    val graph = Array(n) { mutableListOf<Int>() }
    repeat(n-1) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() - 1 }
        graph[a].add(b)
        graph[b].add(a)
    }
    val table = IntArray(n) { -1 }

    fun dfs(v: Int, c: Int) {
        table[v] = c
        for (next in graph[v]) if (table[next] == -1) dfs(next, kotlin.math.abs(c-1))
    }

    dfs(0, 0)
    (1..q).forEach { println(readLine()!!.split(" ").map { it.toInt() - 1 }.let { (c, d) -> if (table[c] == table[d]) "Town" else "Road" }) }
}
