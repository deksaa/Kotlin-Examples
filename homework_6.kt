/**
 *
 *@author Destan_Erik on 12:51 , 24 Temmuz 2017
 *
 */

package homework.homework6

/* Homework - Kotlin - 001 - 3*/

fun signum(number : Int) : Boolean = if (number < 0) false else true

fun main(args: Array<String>) {

    var number = readLine()!!.toInt()

    if (number != 0){
        if(signum(number))
            println("$number is a positive number.")
        else
            println("$number is a negative number.")

    }else
        println("$number is zero.")

}