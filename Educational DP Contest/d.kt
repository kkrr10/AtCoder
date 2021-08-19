import kotlin.math.max

fun main() {
    val (n, w) = readLine()!!.split(" ").map { it.toInt() }
    val dp = Array(n+1) { Array(w+1) { 0L } }
    for(i in 0 until n) {
        val (wi, vi) = readLine()!!.split(" ").map { it.toInt() }
        for(j in 0..w) {
            if(wi <= j) dp[i+1][j] = max(dp[i][j], dp[i][j-wi] + vi)
            else dp[i+1][j] = dp[i][j]
        }
    }
    println(dp[n][w])
}
