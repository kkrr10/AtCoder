fun main() {
    val o = readLine()!!
    val e = readLine()!!
    for(i in 0..(o.length-1)) {
        print(o[i])
        if(i == e.length) break
        print(e[i])
    }
    println()
}
