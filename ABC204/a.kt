fun main() = println(readLine()!!.split(" ").map { it.toInt() }.let { (x, y) -> if (x == y) x else 3 - x - y })