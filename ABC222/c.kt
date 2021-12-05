fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val a = Array(2*n) { readLine()!! }
    val game = listOf('C', 'G', 'P')
    val result = Array(2*n) { it to 0 }
    for (i in 0 until m) {
        for (j in 0 until n) {
            val (p1, v1) = result[2*j]
            val (p2, v2) = result[2*j+1]
            when (game.indexOf(a[p1][i]) - game.indexOf(a[p2][i])) {
                1, -2 -> { result[2*j] = p1 to v1 + 1 }
                -1, 2 -> { result[2*j+1] = p2 to v2 + 1 }
                0 -> { }
            }
        }
        result.sortWith(compareBy({ -it.second }, { it.first }))
    }
    println(result.map { it.first + 1 }.joinToString("\n"))
}
