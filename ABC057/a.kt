fun main() {
    val (a, b) = readLine()!!.split(" ").map{ it.toInt() }
    print(if(a + b < 24) a + b else a + b - 24)
}
