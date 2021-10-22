fun main() {
    readLine()
    val a = readLine()!!.split(" ").map { it.toLong() }.sorted()
    println(readLine()!!.split(" ").map { it.toLong() }.sorted().mapIndexed { i, b -> kotlin.math.abs(a[i] - b) }.sum())
}
