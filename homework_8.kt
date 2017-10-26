/**
 *
 *@author Destan_Erik on 17:49 , 24 Temmuz 2017
 *
 */

package homework.homework8

/*Homework - Kotlin - 002 - 2*/

fun getInputAsDouble(message : String) : Double{
    print(message)
    return readLine()!!.toDouble()
}

fun main(args: Array<String>) {

    var input = getInputAsDouble("Seconds:")
    var temp = input
        if(input != .0) {

            var hours: Double
            var minutes: Double
            var seconds: Double

            hours = input / 3600.toDouble()
            input %= 3600
            minutes = input / 60
            input %= 60
            seconds = input

            print("$temp seconds = ${hours.toInt()} hour(s) , ${minutes.toInt()} minutes(s) , ${seconds.toInt()} second(s)")
        }

}