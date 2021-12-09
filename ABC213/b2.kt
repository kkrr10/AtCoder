fun main() {
    readLine()
    val a = readLine()!!.split(" ").map { it.toInt() }
    println(a.indexOf(a.sorted()[a.size-2]) + 1)
}
