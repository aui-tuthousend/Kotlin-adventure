fun main () {
    val op = 7.0 / 3.0
    val nomer: Array<Int> = arrayOf(33, 4, 5, 66, 7, 8)

    nomer.set(0, 77)
    nomer.set(3, 8)

    val jumlah = nomer[0] + nomer[3]
    println(jumlah)
    println(op)
}