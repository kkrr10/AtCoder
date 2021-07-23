import kotlin.math.min

fun main() {
    val n = readLine()!!.toInt()
    val k = readLine()!!.toInt()
    var ans = 1
    for(i in 0..n-1) ans += min(ans, k)
    println(ans)
}
