import kotlin.math.pow

fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    var fMax = -1
    var fIndex = -1
    var lMax = -1
    var lIndex = -1
    for(i in 0..(2.0.pow(n).toInt()-1)) {
        if(i < 2.0.pow(n-1).toInt() && a[i] > fMax) {
            fMax = a[i]
            fIndex = i
        }
        if(i >= 2.0.pow(n-1).toInt() && a[i] > lMax) {
            lMax = a[i]
            lIndex = i
        }
    }
    println((if(fMax > lMax) lIndex else fIndex) + 1)
}
