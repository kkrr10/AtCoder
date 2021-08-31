fun main() {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    println(if(x * 2 <= y && y <= 4 * x && y % 2 == 0) "Yes" else "No")
}
