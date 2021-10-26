fun main() {
    val n = readLine()!!.toLong()
    var day = 1L
    while (true) {
        if (day * (day + 1) >= n * 2) {
            println(day)
            return
        }
        day++
    }
}
