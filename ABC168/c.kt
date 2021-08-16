import kotlin.math.*

fun main() {
    val (a, b, h, m) = readLine()!!.split(" ").map { it.toDouble() }
    println(sqrt(a.pow(2.0) + b.pow(2.0) - 2 * a * b * cos(2 * PI * (h / 12 + m / 720 - m / 60))))
}
