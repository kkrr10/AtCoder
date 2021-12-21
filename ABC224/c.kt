fun main() {
    val n = readLine()!!.toInt()
    val xy = Array(n) { readLine()!!.split(" ").map { it.toLong() } }
    var ans = 0
    for (a in 0 until n-2) {
        for (b in a+1 until n-1) {
            for (c in b+1 until n) {
                val abx = xy[b][0] - xy[a][0]
                val acx = xy[c][0] - xy[a][0]
                val aby = xy[b][1] - xy[a][1]
                val acy = xy[c][1] - xy[a][1]
                if ((abx*acx + aby*acy).let { it*it } != (abx*abx + aby*aby) * (acx*acx + acy*acy)) ans++
            }
        }
    }
    println(ans)
}
