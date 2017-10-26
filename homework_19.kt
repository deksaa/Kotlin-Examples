package homework

/**
 *
 * @author Destan Erik , 31.08.2017 , 02:10
 *
 */

import homework.homework17.getInputAsString

fun main(args: Array<String>) {

    var str = getInputAsString("Enter any sentence:")


    while (str.first() == ' ')
        str = str.removeRange(0.rangeTo(0))


    while (str.last() == ' ')
        str = str.removeRange((str.length-1).rangeTo(str.length-1))


    println("{" + str + "}")
}


