fun main() {
    val a = readLine()!!
    val b = readLine()!!
    if(a.length > b.length) println("GREATER")
    else if(a.length < b.length) println("LESS")
    else {
        if(a == b) println("EQUAL")
        else {
            for(i in 0..(a.length-1)) {
                if(a[i] < b[i]) {
                    println("LESS")
                    break
                }
                else if(a[i] > b[i]) {
                    println("GREATER")
                    break
                }
            }
        }
    }
}
