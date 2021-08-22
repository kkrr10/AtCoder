import kotlin.math.*

fun main() {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    println(if(min(x, y) + 3 > max(x, y)) "Yes" else "No")
}
