fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() - 1 }

    val table = IntArray(n)
    for(ai in a) table[ai]++

    for(i in 0 until n) println(table[i])
}
