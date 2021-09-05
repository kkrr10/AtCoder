import kotlin.math.*

fun main() {
    val (a, b, w) = readLine()!!.split(" ").map { it.toInt() }
    var mn = 1000001
    var mx = 0
    for(i in 1..1000000) {
        if(a * i <= w * 1000 && w * 1000 <= b * i) {
            mn = min(mn, i)
            mx = max(mx, i)
        }
    }
    println(if(mx == 0) "UNSATISFIABLE" else "$mn $mx")
}
