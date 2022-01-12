fun main() {
    val (n, x) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() - 1 }
    val seen = BooleanArray(n)
    fun dfs(v: Int) {
        seen[v] = true
        if (!seen[a[v]]) dfs(a[v])
    }
    dfs(x-1)
    println(seen.count { it == true })
}
