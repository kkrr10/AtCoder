fun main() {
    var cur = readLine()!!.split(" ")[1].toInt() - 1
    val a = readLine()!!.split(" ").map { it.toInt() - 1 }.toIntArray()
    while (a[cur] != -1) {
        val tmp = cur
        cur = a[cur]
        a[tmp] = -1
    }
    println(a.count { it == -1 })
}
