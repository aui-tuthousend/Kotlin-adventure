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

fun pricing (name: Array<String>, price: Array<Int>, item: Array<Int>, index: Int, i: Int ) {
    var buffer: Int
    println("\nYou Choose " + name[index-1])
    println("the Price is " + price[index-1]+ "k")
    print("How many items do u need : ")
    val reader = Scanner(System.`in`)
    buffer = reader.nextInt()
    item[i] = buffer
    println(item[i])
}

fun main () {
    val name: Array<String> = arrayOf("Bag", "Pencil", "Marker", "Belt", "Correction Pen")
    val price: Array<Int> = arrayOf(100, 5, 7, 50, 8)
    var item: Array<Int> = arrayOf(0)
    var total = 0

    do {
        var i = 0
        menu()
        print("Choose item u needs : ")
        val reader = Scanner(System.`in`)
        val choose: Int = reader.nextInt()
        when (choose){
            1 -> {
                pricing (name, price, item, choose, i)
                total += item[i]*100

            }

            2 -> {
                pricing (name, price, item, choose, i)
                total += item[i]*5
            }

            3 -> {
                pricing (name, price, item, choose, i)
                total += item[i]*7
            }

            4 -> {
                pricing (name, price, item, choose, i)
                total += item[i]*50
            }

            5 -> {
                pricing (name, price, item, choose, i)
                total += item[i]*8
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