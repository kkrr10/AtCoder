fun main() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    val squares = Array(h) { readLine()!! }
    var ans = 0
    val dy = listOf(-1, 0, 1, 0)
    val dx = listOf(0, 1, 0, -1)
    for (y in 1 until h - 1) {
        for (x in 1 until w - 1) {
            if (squares[y][x] == '.') continue
            for (i in dy.indices) {
                if (squares[y + dy[i]][x + dx[i]] == '.' && squares[y + dy[(i+1) % dy.size]][x + dx[(i+1) % dx.size]] == '.') ans++
                if (squares[y + dy[i]][x + dx[i]] == '#' && squares[y + dy[(i+1) % dy.size]][x + dx[(i+1) % dx.size]] == '#' && squares[y + dy[i] + dy[(i+1) % dy.size]][x + dx[i] + dx[(i+1) % dx.size]] == '.') ans++
            }
        }
    }
    println(ans)
}
