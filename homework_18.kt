package homework.homework18

/**
 *
 * @author Destan Erik , 01.09.2017 , 03:31
 *
 */

import homework.homework17.getInputAsString

fun main(args: Array<String>) {

    var str = getInputAsString("Enter a word:")

    var size = str.length - 1

    for (i in 0..size){
        for (j in 0..i){
         print(str[j])
        }
        println()
    }
}

