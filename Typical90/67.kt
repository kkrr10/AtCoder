fun main() {
    var (n, k) = readLine()!!.split(" ")
    repeat(k.toInt()) {
        n = n.toLong(8).toString(9).replace('8', '5')
    }
    println(n)
}
