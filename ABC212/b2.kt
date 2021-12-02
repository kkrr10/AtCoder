fun main() {
    val x = readLine()!!.map { it - '0' }
    println(if (x.toSet().size == 1 || (0..2).map { if ((x[it] + 1) % 10 == x[it+1]) 1 else 0 }.sum() == 3) "Weak" else "Strong")
}
