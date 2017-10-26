package homework

import java.util.ArrayList

/**
 *
 * @author Destan Erik , 12.10.2017 , 18:33
 *
 */

/*
    Mastermind
 */

fun randomInt(min : Int ,max : Int) = (Math.random() * (max - min) + min).toInt()

fun divideDigits(value : Int,digitRange : Int) : ArrayList<Int>
{
    var digits = ArrayList<Int>()
    var number = value
    var temp = 0

    for (i in 1..digitRange){
        temp = number % 10
        number /= 10
        digits.add(temp)
    }
    return digits
}

fun getInformation(specifiedNumber : Int, estimatedNumber : Int,digitRange: Int) : String
{
    var specifiedDigits = divideDigits(specifiedNumber,digitRange)
    var estimatedDigits = divideDigits(estimatedNumber,digitRange)

    var bothCase = 0
    var onceCase = 0

    for (i in specifiedDigits){
        for (j in estimatedDigits){
            if((specifiedDigits.indexOf(i) == estimatedDigits.indexOf(j)) && i == j)
                bothCase++
            else if(i == j)
                onceCase++
            else
                continue
        }
    }
    return createInfo(bothCase,onceCase)
}

fun createInfo(plusInfo : Int,minusInfo : Int) : String
{

    if (plusInfo == 0 && minusInfo == 0)
         return "There is no common."

    else if (plusInfo == 1 && minusInfo == 1)
        return "+ -"

    else if (plusInfo == 1 && minusInfo == 0)
        return "+"

    else if (plusInfo == 0 && minusInfo == 1)
        return "-"

    else if (plusInfo == 0 && minusInfo > 1)
        return "-${minusInfo}"

    else if (plusInfo > 1 && minusInfo == 0)
        return "-${plusInfo}"

    else if(plusInfo == 1 && minusInfo > 1)
        return "+ -${minusInfo}"

    else if(plusInfo > 1 && minusInfo == 1)
        return "+${plusInfo} -"

    else if (plusInfo > 1 && minusInfo > 1)
        return "+${plusInfo} -${minusInfo}"

    else
        return "invalid case"

}

fun main(args: Array<String>)
{
    var specifiedNumber = 0
    var estimatedNumber = 0

    var count = 10
    var range = 1..count
    var digitRange = 4

    specifiedNumber = randomInt(1000,9999)

    for(i in range){
        println("Specified Number : ${specifiedNumber}")
        estimatedNumber = randomInt(1000,9999)
        println("Estimated Number : ${estimatedNumber}")
        println("Information : " + getInformation(specifiedNumber,estimatedNumber,digitRange))
        println()
    }
}