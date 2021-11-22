fun main() {
    readLine()
    val c = readLine()!!.split(" ").map { it.toLong() }.sorted()
    var ans = 1L
    for ((idx, ci) in c.withIndex()) {
        ans *= ci - idx
        ans %= 1000000007
    }
    println(ans)
}
