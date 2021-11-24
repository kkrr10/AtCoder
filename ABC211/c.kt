fun main() {
    val s = readLine()!!
    val target = "chokudai"
    val MOD = 1000000007
    val dp = IntArray(8)
    for (c in s) {
        for ((idx, t) in target.withIndex()) {
            if (c == t) {
                if (idx == 0) dp[idx] = (dp[idx] + 1) % MOD
                else dp[idx] = (dp[idx] + dp[idx-1]) % MOD
                break
            }
        }
    }
    println(dp[7])
}
