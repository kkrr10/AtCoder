fun main() {
    val (_, k) = readLine()!!.split(" ").map { it.toInt() }
    val ps = readLine()!!.split(" ").map { it.toInt() }.sorted()

    var ans = 0
    for(i in 0..k-1) ans += ps[i]

    println(ans)
}
