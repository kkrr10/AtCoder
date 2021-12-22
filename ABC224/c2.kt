fun main() {
    val n = readLine()!!.toInt()
    val xy = Array(n) { readLine()!!.split(" ").map { it.toLong() } }
    var ans = 0
    for (a in 0 until n-2) for (b in a+1 until n-1) for (c in b+1 until n) if ((xy[b][0]-xy[a][0]) * (xy[c][1]-xy[a][1]) - (xy[c][0]-xy[a][0]) * (xy[b][1]-xy[a][1]) != 0L) ans++
    println(ans)
}
