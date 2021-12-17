fun inp() = readLine()!!.split(" ").map { it.toInt() }
fun main() = println(inp().let { (_, p) -> inp().count { it < p } })