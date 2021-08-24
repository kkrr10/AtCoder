fun main() {
    for((idx, c) in readLine()!!.withIndex()) {
        if(!((idx % 2 == 0 && c in 'a'..'z') || (idx % 2 == 1 && c in 'A'..'Z'))) {
            println("No")
            return
        }
    }
    println("Yes")
}
