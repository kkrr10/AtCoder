fun main() {
    val (x, n) = readLine()!!.split(" ").map { it.toInt() }
    if(n == 0) {
        println(x)
        return
    }
    val ps = readLine()!!.split(" ").map { it.toInt() }

    val table = IntArray(110)
    for(p in ps) table[p]++

    var big = 101
    var small = 0
    for(i in x..100) {
        if(table[i] == 0) {
            big = i
            break
        }
    }
    for(i in x downTo 1) {
        if(table[i] == 0) {
            small = i
            break
        }
    }

    println(if(big - x < x - small) big else small)
}
