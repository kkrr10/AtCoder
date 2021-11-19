fun main() {
    val (n, k) = readLine()!!.split(" ").map { it.toLong() }
    val a = readLine()!!.split(" ").map { it.toInt() }
    val quotient = k / n
    val remainder = (k % n).toInt()
    val threshold = a.sorted()[remainder]
    a.forEach { println(quotient + if (it < threshold) 1 else 0) }
}
