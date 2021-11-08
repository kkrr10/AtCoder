fun main() {
    val MOD = 1000000007
    val (n, l) = readLine()!!.split(" ").map { it.toInt() }
    val stair = IntArray(n+1)
    stair[0] = 1
    for (i in 0 until n) {
        stair[i+1] = (stair[i+1] + stair[i]) % MOD
        if (i+l <= n) stair[i+l] = (stair[i+l] + stair[i]) % MOD
    }
    println(stair[n])
}
