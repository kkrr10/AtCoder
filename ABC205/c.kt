import kotlin.math.abs

fun main() {
    var (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    if (c % 2 == 0) {
        a = abs(a)
        b = abs(b)
    }
    println(
        if (a > b) '>'
        else if (a < b) '<'
        else '='
    )
}
