import java.util.Scanner

fun menu () {
    println("\n[Welcome to Back to Back to School Store]")
    println(" The Most Popular Store Among Students")
    println("o---------------------------------------o")
    println(" What do You Need bruh")
    println(" [1]. Bag            |(to keep your shit book warm)|")
    println(" [2]. Pencil         |(to write your useless math :D)|")
    println(" [3]. Marker         |(idk for what is this)|")
    println(" [4]. Belt           |(to beat your bullies at school)|")
    println(" [5]. Correction Pen |(to draw on your school's table)|")
}

fun main () {
    val name: Array<String> = arrayOf("Bag", "Pencil", "Marker", "Belt", "Correction Pen")
    val price: Array<Int> = arrayOf(100, 5, 7, 50, 8)
    var item: Array<Int> = arrayOf(0, 9)

    do {
        var i = 0
        menu()
        print("Choose item u needs : ")
        val reader = Scanner(System.`in`)
        val choose: Int = reader.nextInt()
        when (choose){
            1 -> {
                println("\nYou Choose " + name[0])
                println("the Price is " + price[0] + "k")
                print("How many items do u need : ")
                item[i] = reader.nextInt()

            }

            2 -> {
                println("\nYou Choose " + name[1])
                println("the Price is " + price[1]+ "k")
            }

            3 -> {
                println("\nYou Choose " + name[2])
                println("the Price is " + price[2]+ "k")
            }

            4 -> {
                println("\nYou Choose " + name[3] + " Nice choice brvh")
                println("the Price is " + price[3]+ "k")
            }

            5 -> {
                println("\nYou Choose " + name[5-1])
                println("the Price is " + price[5-1]+ "k")
            }
            else -> {
                println("\nWrong Input moron")
            }
        }
        i++

        print("\nWanna go back? (y/n) ")
        val back = readLine()
    } while(back == "y")
}