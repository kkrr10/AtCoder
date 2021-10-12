import java.util.*

fun main() {
    val n = readLine()!!.toInt()
    val graph = Array(n) { mutableListOf<Int>() }
    repeat(n - 1) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() - 1 }
        graph[a].add(b)
        graph[b].add(a)
    }

    val dist = IntArray(n)

    fun bfs(start: Int) {
        dist.fill(-1)
        dist[start] = 0
        val que = ArrayDeque<Int>()
        que.add(start)
        while (que.isNotEmpty()) {
            val node = que.remove()
            for (next in graph[node]) {
                if (dist[next] == -1) {
                    dist[next] = dist[node] + 1
                    que.add(next)
                }
            }
        }
    }

    bfs(0)
    val u = dist.indexOf(dist.max()!!)
    bfs(u)
    println(dist.max()!! + 1)
}
