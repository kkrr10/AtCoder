import kotlin.math.min

fun main() {
    val (n, m, t) = readLine()!!.split(" ").map { it.toInt() }
    var rest = n
    var prevB = 0
    for(i in 0..m-1) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        rest -= a - prevB
        if(rest <= 0) {
            println("No")
            return
        }
        rest = min(n, rest + b - a)
        prevB = b
    }
    rest -= t - prevB
    println(if(rest <= 0) "No" else "Yes")
}
