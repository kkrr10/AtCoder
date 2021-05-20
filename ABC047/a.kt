fun main() {
    val (a, b, c) = readLine()!!.split(" ").map{ it.toInt() }
    println(if(a == b+c || b == c+a || c == a+b) "Yes" else "No")
}
