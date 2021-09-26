fun main() {
    val n = readLine()!!.toLong()
    for(i in 1..1000000) {
        if("$i$i".toLong() > n) {
            println(i - 1)
            break
        }
    }
}
