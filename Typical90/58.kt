fun main() {
    val table = IntArray(100000) { -1 }
    val (n, k) = readLine()!!.split(" ").map { it.toLong() }
    var current = n.toInt()
    var cnt = 0
    while (table[current] == -1) {
        table[current] = cnt
        current += current.toString().map { it - '0' }.sum()
        current %= 100000
        cnt++
    }
    println(table.indexOf(if (k - table[current] < 0) k.toInt() else ((k - table[current]) % (cnt - table[current])).toInt() + table[current]))
}
