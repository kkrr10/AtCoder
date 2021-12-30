fun main() {
    val n = readLine()!!.toInt()
    val cnt = IntArray(n+1)
    repeat(n-1) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        cnt[a]++
        cnt[b]++
    }
    println(if (cnt.contains(n-1)) "Yes" else "No")
}
