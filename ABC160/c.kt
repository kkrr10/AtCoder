import kotlin.math.max

fun main() {
    val (k, n) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }
    var mx = k - a[n-1] + a[0]
    for(i in 0..n-2) mx = max(mx, a[i+1] - a[i])
    println(k - mx)
}
