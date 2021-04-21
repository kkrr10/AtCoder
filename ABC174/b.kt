fun main() {
    val (n, d) = readLine()!!.split(" ").map { it.toLong() }
    var ans = 0
    for(i in 1..n) {
        val (x, y) = readLine()!!.split(" ").map { it.toLong() }
        if(x*x + y*y <= d*d) ans++
    }
    println(ans)
}
