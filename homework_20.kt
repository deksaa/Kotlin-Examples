package homework

import java.util.ArrayList

/**
 *
 *@author Destan_Erik on 14:07 , 07 Ekim 2017
 *
 */

fun getMessage(message : String) : String{
    print(message)
    return readLine()!!.toString()
}

fun squeeze(str1 : String , str2 : String): ArrayList<Char> {

    var firstSentence = ArrayList<Char>()
    var secondSentence = ArrayList<Char>()
    var commonChars = ArrayList<Char>()

    for (ch in str1)
        firstSentence.add(ch)

    for (ch in str2)
        secondSentence.add(ch)

    for (i in firstSentence){
        for (j in secondSentence){
            if(i == j){
                commonChars.add(i)
            }
        }
    }

    firstSentence.removeAll(commonChars)

    return firstSentence
}


fun main(args: Array<String>) {

    var str1 = getMessage("Enter first sentence:")
    var str2 = getMessage("Enter second sentence:")

    print(squeeze(str1,str2).joinToString(""))
}