fun main() {
    val n = readLine()!!.toInt()
    println(readLine()!!.split(" ").mapIndexed { idx, value -> idx + 1 to value.toInt() }.sortedBy { it.second }[n-2].first)
}
