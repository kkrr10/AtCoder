fun main() {
    readLine()
    val a = readLine()!!.split(" ").map(String::toInt)
    var sm = 0
    for(ai in a) sm = sm xor ai
    for(ai in a) print("${ai xor sm} ")
    println()
}
