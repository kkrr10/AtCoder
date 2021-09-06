fun main() {
    val (h, w, _x, _y) = readLine()!!.split(" ").map { it.toInt() }
    val x = _x - 1
    val y = _y - 1
    val maze = Array(h) { readLine()!! }
    var ans = if(maze[x][y] == '.') 1 else 0
    val dx = listOf(0, 0, 1, -1)
    val dy = listOf(1, -1, 0, 0)
    for(idx in 0 until dx.size) {
        var i = x + dx[idx]
        var j = y + dy[idx]
        while(0 <= i && i < h && 0 <= j && j < w && maze[i][j] == '.') {
            ans++
            i += dx[idx]
            j += dy[idx]
        }
    }
    println(ans)
}
