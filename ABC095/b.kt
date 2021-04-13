import kotlin.math.*

fun main() {
    val (n, x) = readLine()!!.split(" ").map { it.toInt() }
    var rest = x
    var minM = 1001
    for (i in 1..n) {
        val m = readLine()!!.toInt()
        rest -= m
        minM = min(minM, m)
    }
    println(n + rest / minM)
}
