fun main() {
    val cs = readLine()!!.split(" ").map { it.toInt() }.sorted()
    if (cs[3] == cs.sum() || 2 * (cs[0] + cs[3]) == cs.sum()) return println("Yes")
    println("No")
}
