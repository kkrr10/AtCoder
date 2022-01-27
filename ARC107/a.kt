fun sum(x: Long) = x * (x + 1) / 2 % 998244353
fun main() = println(readLine()!!.split(" ").map { it.toLong() }.let { (a, b, c) -> sum(a) * sum(b) % 998244353 * sum(c) % 998244353 })