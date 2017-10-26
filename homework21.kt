package homework

/**
 *
 * @author Destan Erik , 09.10.2017 , 12:36
 *
 */

import homework.homework17.getInputAsString

fun changeCase(str : String) : String{

    var newStr = ""
    var chArray = str.toCharArray()
    for (i in chArray){
        if(i.isLetter()){
            if(i.isLowerCase())
                newStr += i.toUpperCase()
            else
                newStr += i.toLowerCase()
        }
    }
    return newStr
}

fun main(args: Array<String>) {

    var str = getInputAsString("Enter a sentence:")
    println(changeCase(str))

}