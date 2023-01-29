fun main () {
    val grade = 'A'

    val inp = 'T'
    val pass: Array<Char> = arrayOf('Y', 'T')

    when (inp) {
//        is Char -> println("ys iki dtr")
        in pass -> println("Y ini Yeeee")
        !in pass -> println("tolo")

    }

    when (grade) {
        'A' -> {
            println("dongo lu anjing")
        }
        'B' -> {
            println("SSTFUU!!")
        }

        //dua sekaligus
        'C', 'D' -> println("Niat pora kontol")
    }
}