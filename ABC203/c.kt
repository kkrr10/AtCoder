fun main() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val friends = Array(n) {
        val (a, b) = readLine()!!.split(" ").map { it.toLong() }
        a to b
    }.sortedBy { it.first }
    var position = k.toLong()
    for((a, b) in friends) {
        if(a > position) break
        position += b
    }
    println(position)
}
