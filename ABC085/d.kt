fun main() {
    var (n, h) = readLine()!!.split(" ").map{ it.toInt() }
    val b = mutableListOf<Int>()
    var aMax = -1
    for(i in 1..n) {
        val (ai, bi) = readLine()!!.split(" ").map{ it.toInt() }
        if(aMax < ai) aMax = ai
        b.add(bi)
    }
    b.sort()
    b.reverse()

    var ans = 0
    for(bi in b) {
        if(bi >= aMax) {
            h -= bi
            ans++
            if(h <= 0) {
                println(ans)
                return
            }
        }
        else break
    }
    println(ans + (h + aMax - 1)/ aMax)
}
