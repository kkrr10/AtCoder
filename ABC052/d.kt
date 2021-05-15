fun main() {
    val (n, a, b) = readLine()!!.split(" ").map{ it.toInt() }
    val x = readLine()!!.split(" ").map(String::toInt)
    // Note
    var ans: Long = 0
    for(i in 1..(n-1)) {
        // Note
        val walk: Long = (x[i] - x[i-1]) * a.toLong()
        if(walk <= b) ans += walk
        else ans += b
    }
    println(ans)
}
