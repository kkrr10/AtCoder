import kotlin.math.*

fun main() {
    val n = readLine()!!.toInt()
    val ab = Array(n) { readLine()!!.split(" ").map { it.toInt() } }
    var ans = 100_000 * 2
    for(i in 0 until n) {
        for(j in 0 until n) {
            ans = min(ans, if(i == j) ab[i][0] + ab[j][1] else max(ab[i][0], ab[j][1]))
        }
    }
    println(ans)
}
