fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    println(if(a.count { it % 4 == 0 } * 2 + a.count { it % 4 != 0 && it % 2 == 0 } >= n / 2 * 2) "Yes" else "No")
}
