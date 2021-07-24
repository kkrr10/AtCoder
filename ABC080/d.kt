import kotlin.math.max

fun main() {
    val (n, c) = readLine()!!.split(" ").map { it.toInt() }
    val table = IntArray(100010)
    val pointChannel = Array(100010) {mutableSetOf<Int>()};
    for(i in 0..n-1) {
        val (s, t, ci) = readLine()!!.split(" ").map { it.toInt() }
        if(pointChannel[s].contains(ci)) table[s] += 1
        else table[s-1] += 1
        if(pointChannel[t].contains(ci)) table[t-1] -= 1
        else table[t] -= 1
        pointChannel[s].add(ci)
        pointChannel[t].add(ci)
    }
    var ans = -1
    for(i in 1..100009) {
        table[i] += table[i-1]
        ans = max(ans, table[i])
    }
    println(ans)
}
