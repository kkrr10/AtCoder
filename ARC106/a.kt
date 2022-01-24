fun main() {
    val n = readLine()!!.toLong()
    var a = 1L
    for (i in 1..37) {
        a *= 3
        var b = 1L
        for (j in 1..25) {
            b *= 5
            if (a + b == n) return println("$i $j")
        }
    }
    println("-1")
}
