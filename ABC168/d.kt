import java.util.*

fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val graph = Array(n) { mutableListOf<Int>() }
    repeat(m) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() - 1 }
        graph[a].add(b)
        graph[b].add(a)
    }
    val sign = Array(n) { -1 }
    val que = ArrayDeque<Int>()
    que.add(0)
    while(que.isNotEmpty()) {
        val node = que.remove()
        for(next in graph[node]) {
            if(sign[next] == -1) {
                sign[next] = node + 1
                que.add(next)
            }
        }
    }
    println("Yes")
    for(i in 1 until n) println(sign[i])
}
