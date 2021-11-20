import java.util.ArrayDeque

fun main() {
    val (n, q) = readLine()!!.split(" ").map { it.toInt() }
    val graph = Array(n) { mutableListOf<Int>() }
    repeat(n-1) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() - 1 }
        graph[a].add(b)
        graph[b].add(a)
    }
    val table = IntArray(n) { -1 }

    // BFS
    val que = ArrayDeque<Int>()
    table[0] = 0
    que.add(0)
    while (que.isNotEmpty()) {
        val v = que.remove()
        for (next in graph[v]) {
            if (table[next] == -1) {
                table[next] = 1 - table[v]
                que.add(next)
            }
        }
    }

    (1..q).forEach { println(readLine()!!.split(" ").map { it.toInt() - 1 }.let { (c, d) -> if (table[c] == table[d]) "Town" else "Road" }) }
}
