import kotlin.math.pow

fun main() {
    val n = readLine()!!.toLong()
    println(
        (1..5).map {
            val criteria = 10.0.pow(3*it).toLong()
            if(n >= criteria) n - criteria + 1
            else 0L
        }.sum()
    )
}
