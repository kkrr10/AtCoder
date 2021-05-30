fun main() {
    val (a, b, c) = readLine()!!.split(" ")
    println(if(a[a.length-1] == b[0] && b[b.length-1] == c[0]) "YES" else "NO")
}
