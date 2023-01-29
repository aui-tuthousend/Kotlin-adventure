fun main() {
    val nama: Array<String> = arrayOf("Joko", "wokijo")

    nama.set(1, "jowkwoi") //mengganti anggota array

    val kelas: Array<Int?> = arrayOfNulls( 7 )
    kelas[0]=44
    kelas[1]=7

    //val range = 1..100
    val range = 100 downTo 1 step 2

    println(kelas[0])
    println(nama[1])

    println(range.count())
    println(range.contains(50))
    println(range.contains(200))
}