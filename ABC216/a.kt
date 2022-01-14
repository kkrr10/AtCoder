fun main() {
    val (x, y) = readLine()!!.split(".")
    print(x)
    println(when (y) {
        "0", "1", "2" -> "-"
        "7", "8", "9" -> "+"
        else -> ""
    })
}
