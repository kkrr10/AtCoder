@OptIn(ExperimentalStdlibApi::class)
fun main() {
    val s = readLine()!!
    val q = readLine()!!.toInt()
    val dq = ArrayDeque<Char>()
    for(c in s) dq.addLast(c)
    var normal = true

    for(i in 1..q) {
        val query = readLine()!!.split(" ").map { it[0] }
        if(query[0] == '1') {
            normal = !normal
            continue
        }
        when(normal) {
            true -> {
                when(query[1]) {
                    '1' -> dq.addFirst(query[2])
                    '2' -> dq.addLast(query[2])
                }
            }
            false -> {
                when(query[1]) {
                    '1' -> dq.addLast(query[2])
                    '2' -> dq.addFirst(query[2])
                }
            }
        }
    }

    while(!dq.isEmpty()) {
        when(normal) {
            true -> {
                print(dq.first())
                dq.removeFirst()
            }
            false -> {
                print(dq.last())
                dq.removeLast()
            }
        }
    }
    println()
}
