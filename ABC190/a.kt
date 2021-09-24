fun main() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    println(if(a > b - c) "Takahashi" else "Aoki")
}
