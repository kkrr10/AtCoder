fun main() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    val field = mutableListOf<List<Int>>()
    for(i in 0..h-1) field.add(readLine()!!.split(" ").map { it.toInt() })

    val mn = field.map{ it.min()!! }.min()!!
    val sm = field.map{ it.sum() }.sum()

    println(sm - mn * h * w)
}
