import kotlin.math.pow

fun main() {
    val n = readLine()!!.toLong()
    var ans = 0L
    for(i in 1..5) {
        val criteria = 10.0.pow(3*i).toLong()
        if(n >= criteria) ans += n - criteria + 1
    }
    println(ans)
}
