fun main() {
    val db = mutableSetOf<String>()
    (1..readLine()!!.toInt()).map {
        val s = readLine()!!
        if (!db.contains(s)) {
            println(it)
            db.add(s)
        }
    }
}
