fun main() {
    val n = readLine()!!.toLong()
    val mp = mutableMapOf<Int, Long>()
    readLine()!!.split(" ").map { mp[it.toInt()] = (mp[it.toInt()] ?: 0) + 1 }
    println(mp.map { (_, v) -> v * (n - v) }.sum() / 2)
}
