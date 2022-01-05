fun main() {
    var ans = 1L
    repeat(readLine()!!.toInt()) {
        ans = ans * readLine()!!.split(" ").map { it.toInt() }.sum() % 1000000007
    }
    println(ans)
}
