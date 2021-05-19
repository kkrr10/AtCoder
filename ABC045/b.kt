fun main() {
    val a = readLine()!!
    val b = readLine()!!
    val c = readLine()!!
    var ai = 0
    var bi = 0
    var ci = 0
    var state = 'a'
    while(true) {
        when(state) {
            'a' -> {
                if(ai == a.length) {
                    println('A')
                    return
                }
                state = a[ai++]
            }
            'b' -> {
                if(bi == b.length) {
                    println('B')
                    return
                }
                state = b[bi++]
            }
            else -> {
                if(ci == c.length) {
                    println('C')
                    return
                }
                state = c[ci++]
            }
        }
    }
}
