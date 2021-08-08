import kotlin.math.max

fun main() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    val diff = 3 * max(max(a, b), c) - a - b - c
    println(if(diff % 2 == 0) diff / 2 else diff / 2 + 2)
}
