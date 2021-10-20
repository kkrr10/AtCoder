import java.util.*

fun main() {
    val n = readLine()!!.toInt()
    val graph = Array(n) { mutableListOf<Int>() }
    repeat(n-1) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() - 1 }
        graph[a].add(b)
        graph[b].add(a)
    }
    val label = IntArray(n) { -1 }
    fun bfs(start: Int) {
        label[start] = 0
        val que = ArrayDeque<Int>()
        que.add(start)
        while (que.isNotEmpty()) {
            val node = que.remove()
            for (next in graph[node]) {
                if (label[next] == -1) {
                    label[next] = 1 - label[node]
                    que.add(next)
                }
            }
        }
    }
    bfs(0)
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
