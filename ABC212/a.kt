fun main() = println(readLine()!!.split(" ").map { it.toInt() }.let { if (it[1] == 0) "Gold" else if (it[0] == 0) "Silver" else "Alloy" })