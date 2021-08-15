fun main() {
    val n = readLine()!!.toInt()
    val ss = mutableSetOf<String>()
    for(i in 0 until n) ss.add(readLine()!!)
    println(ss.size)
}
