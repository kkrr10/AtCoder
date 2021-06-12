fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val to: MutableSet<Int> = mutableSetOf()
    val from: MutableSet<Int> = mutableSetOf()
    for(i in 1..m) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        if(a == 1) to.add(b)
        if(b == n) from.add(a)
    }
    println(if(to.intersect(from).isEmpty()) "IMPOSSIBLE" else "POSSIBLE")
}
