import kotlin.math.min

fun main() {
    val (n, w) = readLine()!!.split(" ").map { it.toInt() }
    val dp = Array(n+1) { Array(100001) { w+1 } }
    dp[0][0] = 0
    for(i in 0 until n) {
        val (wi, vi) = readLine()!!.split(" ").map { it.toInt() }
        for(j in 0..100000) {
            if(vi <= j) dp[i+1][j] = min(dp[i][j], dp[i][j-vi] + wi)
            else dp[i+1][j] = dp[i][j]
        }
    }
    for(j in 100000 downTo 0) {
        if(dp[n][j] <= w) {
            println(j)
            return
        }
    }
}
