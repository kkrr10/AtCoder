fun main() {
    var (a, b, c, k) = readLine()!!.split(" ").map { it.toInt() }
    if (k <= a) println(k)
    else if (k <= a + b) println(a)
    else println(a - (k - a - b))
}
