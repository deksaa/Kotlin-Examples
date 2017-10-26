/**
 *
 *@author Destan_Erik on 19:42 , 24 Temmuz 2017
 *
 */

package homework.homework9

/* Homework - Kotlin - 006 - 1*/

fun calculateFact(value : Int) : Int{

    var result = 1
    var range = 1..value

    for (i in range)
        result *= i

    return result
}



fun main(args: Array<String>) {

    var result : Double = 0.0
    var range = 1..20

    for (i in range)
        result += 1.toDouble() / calculateFact(i)

    println("Result = ${result + 1}")

}