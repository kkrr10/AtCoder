fun main() {
    val num = readLine()!!.split(" ").map(String::toInt)
    println(if(num.count { it == 5 } == 2 && num.count { it == 7 } == 1) "YES" else "NO")
}
