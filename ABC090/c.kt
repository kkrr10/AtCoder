import kotlin.math.abs

fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toLong() }  // not Int
    println(abs((n-2) * (m-2)))
}
