import kotlin.math.*

fun main() {
    val (r, x, y) = readLine()!!.split(" ").map { it.toDouble() }
    val d = sqrt(x*x + y*y)
    println(if(d < r) 2 else ceil(d / r).toLong())
}
