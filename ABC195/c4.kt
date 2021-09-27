fun main() {
    val n = readLine()!!.toLong()
    var ans = 0L
    var criteria = 1000L
    while(n >= criteria) {
        ans += n - criteria + 1
        criteria *= 1000
    }
    println(ans)
}
