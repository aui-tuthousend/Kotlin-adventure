fun main() {
    val nama: Array<String> = arrayOf("Joko", "wokijo")

    nama.set(1, "maaar") //mengganti anggota array

    val kelas: Array<Int?> = arrayOfNulls( 7 )
    kelas[0]=49
    kelas[1]=-1

    //val range = 1..100
    val range = 120 downTo 1 step 3

    println(kelas[0])
    println(nama[1])

    println(range.count())
    println(range.contains(50))
    println(range.contains(200))
}
