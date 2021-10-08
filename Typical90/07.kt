import kotlin.math.min

fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }.sorted()
    repeat(readLine()!!.toInt()) {
        val b = readLine()!!.toInt()
        var ng = n
        var ok = -1
        while (ng - ok > 1) {
            val mid = (ng + ok) / 2
            if (a[mid] < b) ok = mid
            else ng = mid
        }
        println(
            if (ok == -1) a[0] - b
            else if (ok == n - 1) b - a[ok]
            else min(b - a[ok], a[ok+1] - b)
        )
    }
}
