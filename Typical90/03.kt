import java.util.*

fun main() {
    val n = readLine()!!.toInt()
    val graph = Array(n) { mutableListOf<Int>() }
    repeat(n - 1) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() - 1 }
        graph[a].add(b)
        graph[b].add(a)
    }

    // 1
    val distance = Array(n) { -1 }
    val que = ArrayDeque<Int>()
    distance[0] = 0
    que.add(0)
    while (que.isNotEmpty()) {
        val node = que.remove()
        for (next in graph[node]) {
            if (distance[next] == -1) {
                distance[next] = distance[node] + 1
                que.add(next)
            }
        }
    }
    val u = distance.indexOf(distance.max()!!)

    // 2
    distance.fill(-1)
    distance[u] = 0
    que.add(u)
    while (que.isNotEmpty()) {
        val node = que.remove()
        for (next in graph[node]) {
            if (distance[next] == -1) {
                distance[next] = distance[node] + 1
                que.add(next)
            }
        }
    }
    println(distance.max()!! + 1)
}
