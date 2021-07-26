import kotlin.math.min

fun main() {
    val (a, b, c, d) = readLine()!!.split(" ").map { it.toInt() }
    println(min(a, min(b, min(c, d))))
}
