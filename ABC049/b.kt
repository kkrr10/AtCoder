fun main() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    for(i in 1..h) {
        val s = readLine()!!
        println(s + "\n" + s)
    }
}
