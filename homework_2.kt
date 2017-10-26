/**
 *
 *@author Destan_Erik on 03:34 , 20 Temmuz 2017
 *
 */

package homework.homework2

fun getNumberAsInt(massage : String) : Int{
    print(massage)
    return readLine()!!.toInt()
}

fun isPrime(value:Int) : Boolean
{
    if (value <= 1)
        return false

    if (value % 2 == 0)
        return value == 2

    if (value % 3 == 0)
        return value == 3

    if (value % 5 == 0)
        return value == 5

    if (value % 7 == 0)
        return value == 7

    var i = 11

    while (i * i <= value) {
        if (value % i == 0)
            return false
        i += 2
    }

    return true
}

fun main(args: Array<String>) {

    var number = getNumberAsInt("Enter any positive number to divide into its dividers:")
    var range = 1..(number / 2)

    if (number < 0)
        println("You must enter any positive number.")
    else{
        print("Dividers:")
        while(number != 0) {
            for (n in range)
                if (isPrime(n) && number % n == 0){
                    print("$n ")
                    number /= n
                    break
                }
        }
    }
    println()
}