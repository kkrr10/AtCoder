fun input() = readLine()!!.split(" ").map { it.toInt() }

fun main() {
    val (n, q) = input()
    val a = input().toIntArray()
    var cnt = 0
    repeat(q) {
        val (t, x, y) = input()
        when (t) {
            1 -> {
                val tmp = a[(x-1-cnt+n)%n]
                a[(x-1-cnt+n)%n] = a[(y-1-cnt+n)%n]
                a[(y-1-cnt+n)%n] = tmp
            }
            2 -> cnt = (cnt + 1) % n
            3 -> println(a[(x-1-cnt+n)%n])
        }
    }
}
