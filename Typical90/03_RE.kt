fun main() {
    val n = readLine()!!.toInt()
    val graph = Array(n) { mutableListOf<Int>() }
    repeat(n - 1) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() - 1 }
        graph[a].add(b)
        graph[b].add(a)
    }
    val distance = Array(n) { -1 }
    fun dfs(v: Int, d: Int) {
        if (distance[v] != -1) return
        distance[v] = d
        for (next in graph[v]) dfs(next, d+1)  // StackOverflow
    }
    dfs(0, 0)
    val u = distance.indexOf(distance.max()!!)
    distance.fill(-1)
    dfs(u, 0)
    println(distance.max()!! + 1)
}
