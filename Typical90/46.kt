fun main() {
    readLine()
    val remainder = Array(3) { LongArray(46) }
    readLine()!!.split(" ").map { remainder[0][it.toInt()%46]++ }
    readLine()!!.split(" ").map { remainder[1][it.toInt()%46]++ }
    readLine()!!.split(" ").map { remainder[2][it.toInt()%46]++ }
    var ans = 0L
    for (i in 0..45) for (j in 0..45) ans += remainder[0][i] * remainder[1][j] * remainder[2][(92-i-j)%46]
    println(ans)
}
