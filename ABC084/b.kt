fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    val ss = readLine()!!.split("-")
    println(if(ss.size == 2 && ss[0].length == a) "Yes" else "No")
}