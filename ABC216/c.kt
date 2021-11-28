fun main() {
    var n = readLine()!!.toLong()
    val ans = mutableListOf<Char>()
    while (n > 0) {
        if (n % 2 == 0L) {
            ans.add('B')
            n /= 2
        }
        else {
            ans.add('A')
            n--
        }
    }
    println(ans.reversed().joinToString(separator=""))
}
