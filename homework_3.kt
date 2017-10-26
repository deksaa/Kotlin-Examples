/**
 *
 *@author Destan_Erik on 04:07 , 20 Temmuz 2017
 *
 */

package homework.homework3

import homework.homework4.isPrime

/*Homework - Kotlin - 003 - 3 - GoldBach Theory*/

fun getNumberAsInt(massage : String) : Int{
    print(massage)
    return readLine()!!.toInt()
}

fun main(args: Array<String>) {

    var number = getNumberAsInt("Enter any greater than two,positive and even number:")

    var range = 1..number

    if(number > 2) {
        if (number % 2 == 0) {
            EXIT_LOOP@
            for (i in range) {
                for (j in range) {
                    if ((i + j).equals(number) && isPrime(i) && isPrime(j)) {
                        println("$i + $j = $number")
                        break@EXIT_LOOP
                    }
                }
            }

        } else
            println("The number must be even number.")
    }else
        println("The number must be grater than two.")
}