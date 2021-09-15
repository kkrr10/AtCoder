fun main() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    println(k * (k+1) / 2 * n + n * (n+1) / 2 * k * 100)
}
