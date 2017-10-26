package homework.homework17

import java.util.ArrayList

/**
 *
 * @author Destan Erik , 01.09.2017 , 01:51
 *
 */


fun getInputAsString(message : String = "Enter any string:") : String{
    print(message)
    return readLine()!!.toString()
}

fun main(args: Array<String>) {

    var str : String = getInputAsString()

    if(str.contains('{') && str.contains('}'))
    {

        var index1 = str.lastIndexOf('{')

        var index2 = str.indexOf('}')

        var newStr = str.substring(index1 + 1, index2)

        println(newStr)

    }
    else
    {
        print("Error:Invalid input")
    }
}