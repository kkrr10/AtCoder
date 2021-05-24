fun main() {
    val cards = listOf(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1)
    val (a, b) = readLine()!!.split(" ").map{ it.toInt() }
    println(if(cards.indexOf(a) > cards.indexOf(b)) "Alice" else if(cards.indexOf(a) == cards.indexOf(b)) "Draw" else "Bob")
}
