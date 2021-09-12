fun main() {
    val n = readLine()!!.toInt()
    val s = readLine()!!.toCharArray()
    val q = readLine()!!.toInt()
    var swap = false
    repeat(q) {
        var (t, a, b) = readLine()!!.split(" ").map { it.toInt() - 1 }
        if(t == 1) swap = !swap
        else {
            if(swap) {
                a = (a + n) % (2 * n)
                b = (b + n) % (2 * n)
            }
            val tmp = s[a]
            s[a] = s[b]
            s[b] = tmp
        }
    }
    if(swap) {
        for(i in n until 2 * n) print(s[i])
        for(i in 0 until n) print(s[i])
    }
    else for(i in 0 until 2 * n) print(s[i])
    println()
}
