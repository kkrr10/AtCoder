import kotlin.math.max

fun main() {
    readLine()
    println(max(-readLine()!!.split(" ").map { it.toInt() }.max()!! + readLine()!!.split(" ").map { it.toInt() }.min()!! + 1, 0))
}
