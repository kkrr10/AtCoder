fun inp() = readLine()!!.split(" ").map { it.toInt() }

fun main() {
    val (n, _) = inp()
    val a = inp().sorted()
    val b = inp()
    var ans = Int.MAX_VALUE
    for (bi in b) {
        var ok = n
        var ng = -1
        while (ok - ng > 1) {
            val mid = (ok + ng) / 2
            if (bi <= a[mid]) ok = mid
            else ng = mid
        }
        if (ok == n) ans = minOf(ans, bi - a[n-1])
        else if (ok == 0) ans = minOf(ans, a[0] - bi)
        else ans = minOf(ans, minOf(a[ok] - bi, bi - a[ok-1]))
    }
    println(ans)
}
