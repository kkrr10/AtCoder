fun main() {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    val dp = Array(n+1) { IntArray(7) }
    val target = listOf('a', 't', 'c', 'o', 'd', 'e', 'r')
    val MOD = 1000000007
    for (i in 0 until n) {
        for (j in 0 until 7) dp[i+1][j] = dp[i][j]
        val idx = target.indexOf(s[i])
        if (idx != -1) {
            dp[i+1][idx] += if (idx == 0) 1 else dp[i][idx-1]
            dp[i+1][idx] %= MOD
        }
    }
    println(dp[n][6])
}
