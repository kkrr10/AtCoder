fun main() {
    val s = Array(3) { readLine()!! }
    println(readLine()!!.map { s[it-'1'] }.joinToString(""))
}
