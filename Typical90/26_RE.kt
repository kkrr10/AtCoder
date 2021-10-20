fun main() {
    val n = readLine()!!.toInt()
    val graph = Array(n) { mutableListOf<Int>() }
    repeat(n-1) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() - 1 }
        graph[a].add(b)
        graph[b].add(a)
    }
    val label = IntArray(n) { -1 }
    fun dfs(v: Int, num: Int) {
        if (label[v] != -1) return
        label[v] = num
        for (next in graph[v]) dfs(next, 1 - num)
    }
    dfs(0, 0)
    var cnt = 0;
    val larger = if (label.sum() * 2 >= n) 1 else 0
    for (i in 0 until n) {
        if (label[i] == larger) {
            print("${i+1} ")
            cnt++
        }
        if (cnt * 2 == n) break
    }
    println()
}
