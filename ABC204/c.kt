fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val graph = Array(n) { mutableListOf<Int>() }
    repeat(m) { readLine()!!.split(" ").map { it.toInt() - 1 }.let { graph[it[0]].add(it[1]) } }
    var ans = 0
    val reachable = BooleanArray(n)
    fun dfs(v: Int) {
        if (reachable[v]) return
        ans++
        reachable[v] = true
        for (next in graph[v]) dfs(next)
    }
    for (start in 0 until n) {
        reachable.fill(false)
        dfs(start)
    }
    println(ans)
}
