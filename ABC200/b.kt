fun main() {
    var (n, k) = readLine()!!.split(" ").map { it.toLong() }
    for(i in 0 until k) {
        if(n % 200 == 0L) n /= 200
        else n = n * 1000 + 200
    }
    println(n)
}
