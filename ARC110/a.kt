fun gcd(x: Long, y: Long): Long = if (y == 0L) x else gcd(y, x % y)
fun lcm(x: Long, y: Long) = x / gcd(x, y) * y

fun main() {
    val n = readLine()!!.toLong()
    var ans = 1L
    for (i in 2..n) ans = lcm(i, ans)
    println(++ans)
}
