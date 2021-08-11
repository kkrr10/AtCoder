import kotlin.math.max

fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val ab = mutableListOf<Pair<Int, Int>>()
    for(i in 1..m) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        ab.add(a to b)
    }
    val k = readLine()!!.toInt()
    val cd = mutableListOf<Pair<Int, Int>>()
    for(i in 1..k) {
        val (c, d) = readLine()!!.split(" ").map { it.toInt() }
        cd.add(c to d)
    }

    var ans = 0
    for(bit in 0..(1 shl k)-1) {
        val table = IntArray(n + 1)
        for(i in 0..k-1) {
            if((bit shr i) and 1 == 1) table[cd[i].first]++
            else table[cd[i].second]++
        }
        var cnt = 0
        for(i in 0..m-1) {
            if(table[ab[i].first] > 0 && table[ab[i].second] > 0) cnt++
        }
        ans = max(ans, cnt)
    }

    println(ans)
}
