fun main() {
    val (a, b, c, d) = readLine()!!.split(" ").map { it.toInt() }
    println(if((a + d - 1) / d >= (c + b - 1) / b) "Yes" else "No")
}
