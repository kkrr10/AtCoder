fun main() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    val a = Array(h) { readLine()!!.split(" ").map { it.toInt() } }
    for (i1 in 0 until h-1) for (i2 in i1+1 until h) for (j1 in 0 until w-1) for (j2 in j1+1 until w) if (a[i1][j1] + a[i2][j2] > a[i2][j1] + a[i1][j2]) return println("No")
    println("Yes")
}
