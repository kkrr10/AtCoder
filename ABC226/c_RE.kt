fun main() {
    val n = readLine()!!.toInt()
    val d = Array(n) { readLine()!!.split(" ").map { it.toInt() } }
    val seen = BooleanArray(n)
    var ans = 0L
    fun dfs(v: Int) {
        seen[v] = true
        ans += d[v][0]
        for (idx in 2..d[v][1]+1) {
            if (seen[d[v][idx]-1]) continue
            dfs(d[v][idx]-1)
        }
    }
    dfs(n-1)
    println(ans)
}
