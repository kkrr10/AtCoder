fun main() {
    val n = readLine()!!.toInt()
    val ps = readLine()!!.split(" ").map { it.toDouble() }
    val dp = Array(n+1) { Array(n+1) { 1.0 } }
    for(i in 1..n) {
        for(j in 0..i) {
            dp[i][j] = when(j) {
                0 -> dp[i-1][j] * (1.0 - ps[i-1])
                i -> dp[i-1][j-1] * ps[i-1]
                else -> dp[i-1][j-1] * ps[i-1] + dp[i-1][j] * (1.0 - ps[i-1])
            }
        }
    }
    println(dp[n].mapIndexed { idx, prob -> if(idx >= (n+1)/2) prob else 0.0 }.sum())
}
