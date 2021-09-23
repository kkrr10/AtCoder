import kotlin.math.min

fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    var ans = Int.MAX_VALUE
    for(bit in 0 until (1 shl (n-1))) {
        var result = 0
        var section = a[0]
        for(i in 0 until (n-1)) {
            if((bit shr i) and 1 == 1) {
                result = result xor section
                section = a[i+1]
            }
            else section = section or a[i+1]
        }
        result = result xor section
        ans = min(ans, result)
    }
    println(ans)
}
