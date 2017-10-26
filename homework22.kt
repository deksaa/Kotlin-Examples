package homework

/**
 *
 * @author Destan Erik , 09.10.2017 , 13:10
 *
 */

import homework.homework17.getInputAsString

fun isLegal(keyword : String) : Boolean{

    var state = true

    var hardKeywords = arrayListOf("as","as?","break","class","continue","do","else","false",
                                   "for","fun","if","in","!in","interface","is","!is","null",
                                    "object","package","return","super","this","throw","true",
                                     "try","typealias","val","var","when","while")

    for (keywords in hardKeywords)
        if (keywords == keyword)
            state = !state

    return state
}

fun main(args: Array<String>) {

    var str = getInputAsString("Enter a word:")

    if (isLegal(str))
        println(str + " is appropriate.")
    else
        println("{$str} is not appropriate.")
}