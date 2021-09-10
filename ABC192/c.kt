fun main() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    var ans = n
    for(i in 0 until k) {
        val g1 = ans.toString().split("").sortedDescending().joinToString("").toInt()
        val g2 = ans.toString().split("").sorted().joinToString("").toInt()
        ans = g1 - g2
    }
    println(ans)
}
