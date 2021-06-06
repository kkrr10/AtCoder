fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    println(if(a + b >= 10) "error" else a + b)
}
