/**
 *
 *@author Destan_Erik on 20:18 , 24 Temmuz 2017
 *
 */

package homework.homework10

/* Homework - Kotlin - 006 - 1 */

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

fun main(args: Array<String>) {

    var number = getInputAsInt("Enter a number:")
    println("${sumFactors(number)} is the sum of multipliers of the number.")

}