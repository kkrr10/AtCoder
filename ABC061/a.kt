fun main() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    println(if(a <= c && c <= b) "Yes" else "No")
}
