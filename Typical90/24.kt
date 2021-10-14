import kotlin.math.abs

fun main() {
    val (_, k) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }
    var sum = 0
    for (i in a.indices) sum += abs(a[i] - b[i])
    println(if (sum <= k && (k - sum) % 2 == 0) "Yes" else "No")
}
