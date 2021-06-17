import kotlin.math.min

fun main() {
    val (a, b, n) = readLine()!!.split(" ").map { it.toLong() }
    println(a * min(b-1, n) / b - a * (min(b-1, n) / b))
    // if(b == 1L) println(0)
    // else if(n >= b - 1) println(a * (b - 1) / b)
    // else println(a * n / b - a * (n / b))
}
