fun main() {
    readLine()
    val remainder = LongArray(200)
    readLine()!!.split(" ").map { remainder[it.toInt() % 200]++ }
    println(remainder.map { it * (it - 1) / 2 }.sum())
}
