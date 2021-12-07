fun main() {
    val (s, t) = readLine()!!.split(" ").map { it.toInt() }
    var ans = 0
    for (a in 0..s) for (b in 0..(s-a)) for (c in 0..(s-a-b)) if (a * b * c <= t) ans++
    println(ans)
}
