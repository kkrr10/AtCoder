fun main() {
    val c = mutableListOf("ABC", "ARC", "AGC", "AHC")
    repeat(3) { c.remove(readLine()!!) }
    println(c.first())
}
