fun main() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toLong() }
    var mul = 1L
    (1..b).map{ mul *= c }
    println(if (a < mul) "Yes" else "No")
}
