fun main() {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    val dp = IntArray(7)
    val target = "atcoder"
    val MOD = 1000000007
    for (i in 0 until n) {
        val idx = target.indexOf(s[i])
        if (idx != -1) {
            dp[idx] += if (idx == 0) 1 else dp[idx-1]
            dp[idx] %= MOD
        }
    }
    println(dp[6])
}
