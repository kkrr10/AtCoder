fun main() = println(readLine()!!.split(" ").map { it.toInt() }.let { maxOf(it[1]-it[0]+1, 0) })