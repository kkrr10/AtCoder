fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }
    val cTable = LongArray(n)
    readLine()!!.split(" ").map { cTable[it.toInt()-1]++ }
    val bTable = LongArray(n+1)
    for((index, value) in cTable.withIndex()) bTable[b[index]] += value
    println(a.map { bTable[it] }.sum())
}
