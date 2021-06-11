fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }

    var idx = n - 1
    while(idx > 0) {
        print("${a[idx]} ")
        idx -= 2
    }
    print("${a[0]} ")
    when(idx) {
        0 -> idx = 1
        -1 -> idx = 2
    }
    while(idx < n - 1) {
        print("${a[idx]} ")
        idx += 2
    }
    println()
}
