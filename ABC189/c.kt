import kotlin.math.*

fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    var ans = -1
    for(l in 0..n-1) {
        var currMax = a[l]
        for(r in l..n-1) {
            currMax = min(currMax, a[r])
            ans = max(ans, currMax * (r - l + 1))
        }
    }
    println(ans)
}
