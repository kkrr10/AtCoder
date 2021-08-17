import kotlin.math.*

fun main() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val hs = readLine()!!.split(" ").map { it.toInt() }

    val table = IntArray(n) { Int.MAX_VALUE }
    table[0] = 0
    for(i in 0 until n - 1) for(j in (i+1)..min(i+k, n-1)) table[j] = min(table[j], table[i] + abs(hs[i] - hs[j]))

    println(table[n-1])
}
