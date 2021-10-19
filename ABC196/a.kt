fun rec() = readLine()!!.split(" ").map { it.toInt() }
fun main() = println(rec()[1] - rec()[0])