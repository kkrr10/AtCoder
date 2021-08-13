fun main() {
    val (n, s, d) = readLine()!!.split(" ").map { it.toInt() }
    for(i in 0 until n) {
        val (x, y) = readLine()!!.split(" ").map { it.toInt() }
        if(x < s && y > d) {
            println("Yes")
            return
        }
    }
    println("No")
}
