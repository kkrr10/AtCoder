import kotlin.math.min

fun main() {
    val n = readLine()!!.toInt()
    var ans = Int.MAX_VALUE
    for(i in 0 until n) {
        val (a, p, x) = readLine()!!.split(" ").map { it.toInt() }
        if(x - a > 0) ans = min(ans, p)
    }
    println(if(ans == Int.MAX_VALUE) -1 else ans)
}
