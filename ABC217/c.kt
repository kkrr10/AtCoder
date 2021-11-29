fun main() {
    readLine()
    println(readLine()!!.split(" ").mapIndexed { i, v -> i+1 to v.toInt() }.sortedBy { it.second }.map { it.first }.joinToString(" "))
}
