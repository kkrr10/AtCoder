fun main() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    val maze = Array(h) { readLine()!! }
    val MOD = 1_000_000_000 + 7
    val dp = Array(h+1) { Array(w+1) { 0 } }
    dp[0][1] = 1
    for(i in 0 until h) {
        for(j in 0 until w) {
            if(maze[i][j] == '#') continue
            dp[i+1][j+1] = (dp[i][j+1] + dp[i+1][j]) % MOD
        }
    }
    println(dp[h][w])
}
