fun main() {
    val n = readLine()!!.toLong()
    var ok = n
    var ng = 0L
    while (ok - ng > 1) {
        val mid = (ok + ng) / 2
        if (mid * (mid + 1) >= n * 2) ok = mid
        else ng = mid
    }
    println(ok)
}
