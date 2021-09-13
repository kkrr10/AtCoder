fun main() {
    val n = readLine()!!.toInt()
    var firstName = ""
    var secondName = ""
    var firstHeight = 0
    var secondHeight = -1
    repeat(n) {
        val (s, _t) = readLine()!!.split(" ")
        val t = _t.toInt()
        when {
            t > firstHeight -> {
                secondName = firstName
                secondHeight = firstHeight
                firstName = s
                firstHeight = t
            }
            t < secondHeight -> {}
            else -> {
                secondName = s
                secondHeight = t
            }
        }
    }
    println(secondName)
}
