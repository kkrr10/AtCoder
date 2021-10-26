fun main() {
    val n = readLine()!!.toInt()
    println((1..n).find { it * (it + 1) >= n * 2 })
}
