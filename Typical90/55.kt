fun inp() = readLine()!!.split(" ").map { it.toLong() }

fun main() {
    val (n, p, q) = inp()
    val a = inp()
    var ans = 0L
    for (i in 0 until n.toInt()) for (j in 0 until i) for (k in 0 until j) for (l in 0 until k) for (m in 0 until l) if (a[i] % p * a[j] % p * a[k] % p * a[l] % p * a[m] % p == q) ans++
    println(ans)
}
