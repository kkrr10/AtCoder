import kotlin.math.max

fun main() {
    readLine()
    println(readLine()!!.split(" ").map { max(it.toInt() - 10, 0) }.sum())
}
