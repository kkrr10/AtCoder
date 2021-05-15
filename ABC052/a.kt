fun main() {
    val (a, b, c, d) = readLine()!!.split(" ").map { it.toInt() }
    if(a * b > c * d) println(a * b)
    else println(c * d)
}
