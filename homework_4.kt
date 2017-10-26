/**
 *
 *@author Destan_Erik on 04:32 , 20 Temmuz 2017
 *
 */

package homework.homework4

/*Homework - Kotlin - 004 - 1*/

fun getReverse(number : Int , digit : Int) :Int{
    var reverseNumber = 0
    var digitCount = digit - 1
    var n = number
    var remain = 0

    while (n != 0){
        remain = n % 10
        n /= 10
        reverseNumber += Math.pow(10.toDouble(),digitCount--.toDouble()).toInt() * remain
    }
    return reverseNumber
}

fun getFirstTwoDigit(number : Int , digit : Int) : Int = number / Math.pow(10.toDouble(),(digit - 2).toDouble()).toInt()

fun getLastTwoDigit(number : Int , digit: Int) : Int =  number % Math.pow(10.toDouble(),(digit - 1).toDouble()).toInt()

fun isPrime(value:Int) : Boolean {
    if (value <= 1)
        return false

    if (value % 2 == 0)
        return value == 2

    if (value % 3 == 0)
        return value == 3

    if (value % 5 == 0)
        return value == 5

    if (value % 7 == 0)
        return value == 7

    var i = 11

    while (i * i <= value) {
        if (value % i == 0)
            return false
        i += 2
    }

    return true
}

fun printAcceptableNumbers(number : Int){

    if (number < getReverse(number, 3) &&
            isPrime(number) &&
            isPrime(getReverse(number, 3)) &&
            isPrime(getFirstTwoDigit(number, 3)) &&
            isPrime(getLastTwoDigit(number, 3)) &&
            isPrime(getReverse(getFirstTwoDigit(number, 3), 2)) &&
            isPrime(getReverse(getLastTwoDigit(number, 3), 2)))
    println(number)
}

fun main(args: Array<String>) {

    var range = 100..999
        for (n in range)
            printAcceptableNumbers(n)
}