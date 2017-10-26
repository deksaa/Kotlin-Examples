/**
 *
 *@author Destan_Erik on 21:33 , 24 Temmuz 2017
 *
 */

package homework.homework12

/*Homework - Kotlin - 006 - 4 */

fun getInputAsInt(message : String) : Int{
    print(message)
    return readLine()!!.toInt()
}

fun sumFactors(number : Int) : Int{

    var edge = number / 2
    var count = 1
    var sum = 0
    while (count <= edge) {
        if (number % count == 0)
            sum += count++
        else
            count++
    }
    return sum
}

fun isPerfect(number : Int) : Boolean = sumFactors(number) == number

fun findFourDigitPerfectNumber(){
    var range = 1000..9999
    for (i in range)
        if (isPerfect(i))
            println("4-digit perfect number is $i")
}

fun main(args: Array<String>) {

    var number = getInputAsInt("Enter a number:")

    if (isPerfect(number))
        println("$number is perfect number.")
    else
        println("$number is not perfect number.")

    findFourDigitPerfectNumber()
}