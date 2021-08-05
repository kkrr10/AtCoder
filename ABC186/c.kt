fun main() {
    val n = readLine()!!.toInt()
    var ans = 0
    for(i in 1..n) {
        if(!i.toString(10).contains("7") && !i.toString(8).contains("7")) ans++
    }
    println(ans)
}
