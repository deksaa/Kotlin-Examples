/**
 *
 *@author Destan_Erik on 21:07 , 24 Temmuz 2017
 *
 */

package homework.homework11

/*Homework - Kotlin - 006 - 3*/

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

fun areFriends(number1 : Int , number2 : Int): Boolean {
    if(sumFactors(number1) == number2 && sumFactors(number2) == number1)
        return true
    else
        return false
}

fun main(args: Array<String>) {

    var rangeStart = 1000..9999
    var rangeStop = 1000..9999

    for (i in rangeStart)
        for (j in rangeStop)
            if (areFriends(i, j))
                println("$i - $j are friends number.")

}