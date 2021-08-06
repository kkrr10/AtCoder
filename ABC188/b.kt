fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }
    var inP = 0
    for(i in 0..n-1) inP += a[i] * b[i]
    println(if(inP == 0) "Yes" else "No")
}
