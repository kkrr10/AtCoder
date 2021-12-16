fun main() {
    val s = readLine()!!
    val t = readLine()!!
    val comp = (0 until s.length).map { if (s[it] == t[it]) 0 else 1 }
    when (comp.sum()) {
        0 -> return println("Yes")
        2 -> {
            val f = comp.indexOfFirst { it == 1 }
            val l = comp.indexOfLast { it == 1 }
            if (l - f == 1 && s[f] == t[l] && s[l] == t[f]) return println("Yes")
        }
        else -> {}
    }
    println("No")
}
