fun main() {
    val (n, t) = readLine()!!.split(" ").map { it.toInt() }
    val ts = readLine()!!.split(" ").map { it.toInt() }
    var last = 0
    var ans = n * t

    for(ti in ts) {
        if(ti < last) ans -= last - ti
        last = ti + t
    }

    println(ans)
}
