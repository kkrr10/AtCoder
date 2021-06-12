import kotlin.math.*

fun main() {
    readLine()
    val a = readLine()!!.split(" ").map { it.toLong() }
    val sm = a.sum()
    var snuke = a[0]
    var diffMin = abs(sm - 2 * snuke)
    for(i in 1..(a.size-2)) {
        snuke += a[i]
        diffMin = min(diffMin, abs(sm - 2 * snuke))
    }
    println(diffMin)
}
