fun main() = println(readLine()!!.split(" ").map { it.padStart(19, '0') }.let { (a, b) -> if ((0..18).all { (a[it] - '0') + (b[it] - '0') <= 9 }) "Easy" else "Hard" })