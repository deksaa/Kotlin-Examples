/**
 *
 *@author Destan_Erik on 17:22 , 24 Temmuz 2017
 *
 */

package homework.homework7

/*Homework - Kotlin - 002 - 1*/

fun main(args: Array<String>) {

    var row = readLine()!!.toInt()
    var rowRange = 1..(row * 2)

    for (rowCount in rowRange){

        if(rowCount <= row) {

            for (spaceCount in 1..(row - rowCount))
                print(" ")

            for (asteriks in 1..(2 * rowCount - 1))
                print("*")

            println()

        }
        else
        {
            for (spaceCount in 1..(rowCount - row))
                print(" ")

            for (asteriks in 1..(2 * (2 * row - rowCount) - 1))
                print("*")

            println()
        }
    }
}