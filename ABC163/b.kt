import kotlin.math.max

fun main() {
    val (n, _) = readLine()!!.split(" ").map { it.toInt() }
    println(max(n - readLine()!!.split(" ").map { it.toInt() }.sum(), -1))
}
