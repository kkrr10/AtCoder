fun main() = println(readLine()!!.split(" ").map { (it[0] - '0') + (it[1] - '0') + (it[2] - '0') }.max())
