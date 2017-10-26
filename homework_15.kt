/**
 *
 *@author Destan_Erik on 03:46 , 28 Ağustos 2017
 *
 */

package homework.homework15

/* Homework - Kotlin - 007 - 1 */

import homework.homework5.isPrime as isPrime

fun randomInt(min : Int ,max : Int) = (Math.random() * (max - min) + min).toInt()
fun checkLimit(num1: Int,num2 : Int,num3 : Int,limit : Int) : Boolean = if(num1+num2+num3 < limit) true else false
fun findMid(num1: Int,num2: Int,num3: Int,min: Int,max: Int) : Int {

    if (num1 > min && num1 < max)
        return num1
    else if (num2 > min && num2 < max)
        return num2
    else
        return num3
}
fun findMinimum(num1 : Int,num2 : Int,num3 : Int) : Int{

    if (num1 < num2 && num1 < num3)
        return num1
    else if (num2 < num1 && num2 < num3)
        return num2
    else
        return num3
}
fun findMaximum(num1 : Int,num2 : Int,num3 : Int) : Int{

    if (num1 > num2 && num1 > num3)
        return num1
    else if (num2 > num1 && num2 > num3)
        return num2
    else
        return num3
}

fun main(args: Array<String>) {

    var num1 : Int
    var num2 : Int
    var num3 : Int
    var maximum : Int
    var minimum : Int
    var mid : Int
    var loopCount  = 130_000
    var loop = 1..loopCount
    var winCount  = 0

    for (i in loop){

        do {
            num1 = randomInt(1,100)
            num2 = randomInt(1,100)
            num3 = randomInt(1,100)
        }while (num1 == num2 || num1 == num3 || num2 == num3)

        minimum = findMinimum(num1,num2,num3)
        maximum = findMaximum(num1,num2,num3)
        mid = findMid(num1,num2,num3,minimum,maximum)


        if (checkLimit(num1,num2,num3,150))
            winCount++
        else if (isPrime(num1 + num2 + num3))
            winCount++
        else if(maximum - minimum > mid)
            winCount++
    }

    println("-------------------------------------------")
    println("Total loop times are ${loopCount}")
    println("Win counter are ${winCount}")
    println("Win posibility is ${winCount.toDouble() / loopCount}")
    println("-------------------------------------------")
}