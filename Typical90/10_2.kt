fun main() {
    val n = readLine()!!.toInt()
    val score = Array(2) { IntArray(n) }
    for (number in 0 until n) readLine()!!.split(" ").let { score[it[0].toInt()-1][number] = it[1].toInt() }
    val scoreSum = Array(2) { IntArray(n+1) }
    for (i in 1..n) for (c in 0..1) scoreSum[c][i] = scoreSum[c][i-1] + score[c][i-1]
    repeat(readLine()!!.toInt()) {
        val (l, r) = readLine()!!.split(" ").map { it.toInt() }
        for (c in 0..1) print("${scoreSum[c][r] - scoreSum[c][l-1]} ")
        println()
    }
}
