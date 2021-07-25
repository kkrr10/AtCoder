fun main() {
    val n = readLine()!!.toInt()
    val list = mutableListOf<Long>()
    var aoki = 0L
    for(i in 0..n-1) {
        val (a, b) = readLine()!!.split(" ").map { it.toLong() }
        aoki += a
        list.add(2 * a + b)
    }

    var counter = 0
    var takahashi = 0L
    list.sortedDescending().forEach {
        counter++
        takahashi += it
        if(takahashi > aoki) {
            println(counter)
            return
        }
    }
}
