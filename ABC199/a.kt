fun main() = println(readLine()!!.split(" ").map { it.toInt() }.let { (a, b, c) -> if (a*a + b*b < c*c) "Yes" else "No" })