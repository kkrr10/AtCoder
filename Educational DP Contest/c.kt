import kotlin.math.max

fun main() {
    val n = readLine()!!.toInt()
    val dp = Array(n+1) { Array(3) { 0 } }
    for(i in 1..n) {
        val (a, b, c) = readLine()!!.split(" ").map{ it.toInt() }
        dp[i][0] = max(dp[i-1][1], dp[i-1][2]) + a
        dp[i][1] = max(dp[i-1][2], dp[i-1][0]) + b
        dp[i][2] = max(dp[i-1][0], dp[i-1][1]) + c
    }
    println(max(max(dp[n][0], dp[n][1]), dp[n][2]))
}
