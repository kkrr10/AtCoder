import kotlin.math.*

fun main() {
    val (n, a, b) = readLine()!!.split(" ").map { it.toInt() }
    println(min(a*n, b))
}
