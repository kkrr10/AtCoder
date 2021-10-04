fun main() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    val squares = Array(h) { readLine()!! }
    var ans = 0
    for (y in 0 until h - 1) {
        for (x in 0 until w - 1) {
            if (listOf(squares[y][x], squares[y][x+1], squares[y+1][x], squares[y+1][x+1]).count { it == '#' } % 2 == 1) ans++
        }
    }
    println(ans)
}
