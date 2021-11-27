fun inp() = readLine()!!.split(" ").map { it.toInt() }

fun main() {
    val n = readLine()!!.toInt()
    val s = inp()
    val table = inp().toMutableList()
    (1..2*n).forEach { table[it%n] = minOf(table[it%n], table[(it-1)%n] + s[(it-1)%n]) }
    table.forEach { println(it) }
}
