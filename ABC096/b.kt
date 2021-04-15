import kotlin.math.*


fun main() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    val k = readLine()!!.toInt()
    println(max(max(a, b), c) * 2.0.pow(k).toInt() + a + b + c - max(max(a, b), c))
}
