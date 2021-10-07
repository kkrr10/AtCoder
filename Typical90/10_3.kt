fun main() {
    val n = readLine()!!.toInt()
    val scoreSum = Array(2) { IntArray(n+1) }
    for (i in 1..n) {
        for (c in 0..1) scoreSum[c][i] = scoreSum[c][i-1]
        readLine()!!.split(" ").let { scoreSum[it[0].toInt()-1][i] += it[1].toInt() }
    }
    repeat(readLine()!!.toInt()) {
        readLine()!!.split(" ").map { it.toInt() }.let {
            for (c in 0..1) print("${scoreSum[c][it[1].toInt()] - scoreSum[c][it[0].toInt()-1]} ")
        }
        println()
    }
}
