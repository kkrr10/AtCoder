fun main() {
    val s = Array(3) { readLine()!! }
    val contests = listOf("ABC", "ARC", "AGC", "AHC")
    for (c in contests) {
        if (!s.contains(c)) {
            println(c)
            return
        }
    }
}
