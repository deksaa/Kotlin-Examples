/**
 *
 *@author Destan_Erik on 03:31 , 20 Temmuz 2017
 *
 */

package homework.homework1

/*Homework - Kotlin - 003 - 2*/

fun getNumberAsInt(massage : String) : Int{
    print(massage)
    var number = readLine()!!.toInt()
    return if(number < 2) 2 else number
}


fun main(args: Array<String>) {

    var height = getNumberAsInt("Height:")
    var width = getNumberAsInt("Width:")

    var row = 1..height
    var column = 1..width

    var flag = 1
    var direction : Boolean = true

    for (rowCounter in row){

        print("|")

        if (width == flag || (direction == false && flag == 1))
            direction = !direction

        for (columnCounter in column)
            if (columnCounter == flag)
                print("*")
            else
                print(" ")

        if(direction)
            flag++
        else
            flag--

        println("|")
    }
}