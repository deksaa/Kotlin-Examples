/**
 *
 *@author Destan_Erik on 01:00 , 24 Temmuz 2017
 *
 */

package homework.homework5

fun isPrime(value:Int) : Boolean {
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

fun isPrimeX(value : Int) : Boolean {

    var n = 0

    if (isPrime(value)) {
        if (digitsSum(value) < 10) {
            if (isPrime(digitsSum(value)))
                return true
        }
        else
        {
            n = digitsSum(value)
            while (n > 10){
                if (isPrime(digitsSum(n)) && n < 10)
                    return true
                else
                    n = digitsSum(n)
            }
            return false
        }
        return false
    }
    else
        return false
}

fun digitsSum(value : Int) : Int{

    var n = value
    var sum = 0

    while(n != 0){
        sum += n % 10
        n /= 10
    }
    return sum
}

fun main(args: Array<String>) {

    var range = 1..100000
    for (i in range)
        if (isPrimeX(i))
            println(i)
}