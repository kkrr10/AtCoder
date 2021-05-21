fun main() {
    val c = readLine()!![0]
    val vowel = listOf('a', 'i', 'u', 'e', 'o')
    println(if(vowel.contains(c)) "vowel" else "consonant")
}
