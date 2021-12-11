fun main() {
    val n = readLine()!!.toInt()
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    var ans = 10000
    for (i in 0..minOf(9999, n/a)) for (j in 0..minOf(9999-i, (n-a*i)/b)) if ((n-a*i-b*j) % c == 0) ans = minOf(ans, i + j + (n-a*i-b*j)/c)
    println(ans)
}
