fun main() {
    val (_, k) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ")
    val sum = readLine()!!.split(" ").mapIndexed { i, b -> kotlin.math.abs(a[i].toInt() - b.toInt()) }.sum()
    println(if (sum <= k && (k - sum) % 2 == 0) "Yes" else "No")
}
