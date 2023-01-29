fun main() {
    val range = 1..2 //bisa dikasih step 2 or downTo step 3
    var met = 0
    for (i in range) {
        println("Ini ke  = $i")
        met++
    }
    println(met)

    val aray: Array<String> = arrayOf("Jimbe", "Jooko", "Jawir")
    val jumlahAray = aray.size-1
    for (j in 0..jumlahAray) {
        println("Index ke $j = ${aray.get(j)}")
    }

}