fun main() {
    val n = readLine()!!.toLong()
    var now = 1L
    for (i in 0..60) {
        now *= 2
        if (now > n) {
            println(i)
            return
        }
    }
}
