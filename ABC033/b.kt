fun main() {
    val n = readLine()!!.toInt()
    var sum = 0
    var pMax = 0
    var name = ""
    repeat(n) {
        val (s, _p) = readLine()!!.split(" ")
        val p = _p.toInt()
        sum += p
        if (p > pMax) {
            pMax = p
            name = s
        }
    }
    println(if (sum < 2 * pMax) name else "atcoder")
}
