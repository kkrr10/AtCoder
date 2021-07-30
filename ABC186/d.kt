fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }.sorted()
    var ans = 0L

    for(i in 0..n-1) ans += (2*i - n + 1) * a[i]

    println(ans)
}
