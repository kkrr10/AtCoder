import kotlin.math.*

fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    println(((1900 * m + 100 * (n-m)) * 2.0.pow(m)).toInt())
}
