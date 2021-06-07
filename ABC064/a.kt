fun main() {
    var (r, g, b) = readLine()!!.split(" ").map { it.toInt() }
    r *= 100
    g *= 10
    println(if((r + g + b) % 4 == 0) "YES" else "NO")
}
