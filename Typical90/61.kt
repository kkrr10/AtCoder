fun main() {
    val dq = mutableListOf<Int>()
    repeat(readLine()!!.toInt()) {
        val (t, x) = readLine()!!.split(" ").map { it.toInt() }
        when (t) {
            1 -> dq.add(0, x)
            2 -> dq.add(x)
            3 -> println(dq[x-1])
        }
    }
}
