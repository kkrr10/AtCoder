fun main() {
    val n = readLine()!!.toLong()
    val a = readLine()!!.split(" ").map { it.toLong() }
    println(n * a.map { it * it }.sum() - a.sum() * a.sum())
}
