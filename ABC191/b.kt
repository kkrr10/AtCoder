fun main() {
    val (_, x) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }
    for(ai in a) if(ai != x) print("$ai ")
    println()
}
