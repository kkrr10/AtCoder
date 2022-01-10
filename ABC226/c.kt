import java.util.*

fun main() {
    val n = readLine()!!.toInt()
    val d = Array(n) { readLine()!!.split(" ").map { it.toInt() } }
    var ans = 0L
    val seen = BooleanArray(n)
    val que = ArrayDeque<Int>()
    seen[n-1] = true
    que.add(n-1)
    while(que.isNotEmpty()) {
        val v = que.remove()
        ans += d[v][0]
        for (idx in 2..d[v][1]+1) {
            val next = d[v][idx] - 1
            if (!seen[next]) {
                seen[next] = true
                que.add(next)
            }
        }
    }
    println(ans)
}
