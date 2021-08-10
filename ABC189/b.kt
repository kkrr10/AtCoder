fun main() {
    val (n, x) = readLine()!!.split(" ").map { it.toInt() }
    var sm = 0
    for(i in 1..n) {
        val (v, p) = readLine()!!.split(" ").map { it.toInt() }
        sm += v * p
        if(sm > x * 100) {
            println(i)
            return
        }
    }
    println(-1)
}
