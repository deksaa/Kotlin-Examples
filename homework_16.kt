/**
 *
 *@author Destan_Erik on 04:00 , 28 Ağustos 2017
 *
 */

package homework.homework16

import homework.homework15.randomInt

fun isLeapYear(year : Int) : Boolean = year % 4 == 0 && year % 100 != 0 || year % 400 == 0

fun getMonthAsString(numberOfMonth : Int) : String{

    var response : String

    response = when(numberOfMonth){

        1  -> "Jan"
        2  -> "Feb"
        3  -> "Mar"
        4  -> "Apr"
        5  -> "May"
        6  -> "Jun"
        7  -> "Jul"
        8  -> "Aug"
        9  -> "Sep"
        10 -> "Oct"
        11 -> "Nov"
        12 -> "Dec"
        else -> {
            println("Invalid parameter.")
            return "invalid parameter"
        }

    }
    return response
}

fun getRandomDay(month : Int , year : Int) : Int{

    var bounds : Int = 31

    when(month){

        2 -> {
            bounds = 28
            if (isLeapYear(year))
                bounds++
        }

        4,6,9,11 -> {
            bounds = 30
        }
    }

    return randomInt(1,bounds + 1)

}

fun getRandomMonth() : Int = randomInt(1,12+1)

fun getRandomYear(lowerYear: Int,upperYear: Int) = randomInt(lowerYear,upperYear)

fun getRemain(day : Int) : Int = day % 10

fun printRandomDate(lowerYear : Int,upperYear : Int){

    var day : Int
    var month : Int
    var year : Int

    var suffix : String


    year = getRandomYear(lowerYear,upperYear)

    month = getRandomMonth()

    day = getRandomDay(month,year)

    suffix = when(getRemain(day)){

        0 -> "th"
        1 -> "st"
        2 -> "nd"
        3 -> "rd"
        4,5,6,7,8,9 -> "th"
        else -> {"invalid"}

    }

    println("${day}$suffix ${getMonthAsString(month)} ${year}")

}

fun main(args: Array<String>) {

    for (i in 1..100) {
        printRandomDate(1900, 2100)
    }
}

