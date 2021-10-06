fun main() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    val a = Array(h) { readLine()!!.split(" ").map { it.toInt() } }
    val xSum = Array(h) { a[it].sum() }
    val ySum = Array(w) { idx -> (0..h-1).map { a[it][idx] }.sum() }
    for (y in 0 until h) println(IntArray(w) { xSum[y] + ySum[it] - a[y][it] }.joinToString(" "))
}
