fun main() {
    println("Hello World!")

    //hexadecimal = 0x 789ABCDEF
    //binary = 0b 0010 1011
    //number exercise

    //pendeklarasian variabel

    val binary: Float = 3.14F
    val circle: Int = 19
    var area: Float = binary*circle*circle

    //cara 2
    var kobe = 24 //int
    var long = 3500L //long
    var panjang = 3.3F //float
    var kampus = "uneer"

    //jenis variable = var (bisa diubah), val (can't diubah)

    val phi = 3.14F
    val rupiah = 100000L

    //string tips
    val nama = "rehan slebor"
    //menghitung jumlah karakter di variabel
    println(nama.length)
    //untuk multi line
    val artikel = """asddassadasdddaaxaxaxxaxaxaxaxaxxxxxxxx
        |asdsadasdadasdadadasadasda
        |asssuuu
    """.trimMargin()

    //cara mengubah tipe data
    var areaint: Int = area.toInt()

    println(areaint)

    var coba: Int
    coba = 99

    print(panjang)
}