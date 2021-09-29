fun main() {
    val MOD = 1000000007L
    val (a, b, c) = readLine()!!.split(" ").map { it.toLong() }
    println(a * b % MOD * c % MOD)
}
