fun main() {
    val x = readLine()!!
    if (x.toCharArray().toSet().size == 1) {
        println("Weak")
        return
    }
    for (i in 0..2) {
        if (x[i] == '9') {
            if (x[i+1] != '0') {
                println("Strong")
                return
            }
        }
        else if (x[i+1] - x[i] != 1) {
            println("Strong")
            return
        }
    }
    println("Weak")
}
