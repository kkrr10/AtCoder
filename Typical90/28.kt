fun main() {
    val n = readLine()!!.toInt()
    val table = Array(1001) { IntArray(1001) }
    repeat(n) {
        val (lx, ly, rx, ry) = readLine()!!.split(" ").map { it.toInt() }
        table[ly][lx]++
        table[ly][rx]--
        table[ry][lx]--
        table[ry][rx]++
    }
    for (x in 1..1000) for (y in 0..1000) table[y][x] += table[y][x-1]
    for (y in 1..1000) for (x in 0..1000) table[y][x] += table[y-1][x]
    val ans = IntArray(n+1)
    for (y in 0..1000) for (x in 0..1000) ans[table[y][x]]++
    for (idx in 1..n) println(ans[idx])
}
