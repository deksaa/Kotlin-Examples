package homework.homework14

/**
 *
 *@author Destan_Erik on 03:15 , 15 Ağustos 2017
 *
 */

/*Homework - Kotlin - 007 - 1 */

fun randomInt(min : Int ,max : Int) = (Math.random() * (max - min + 1) + min).toInt()

fun main(args: Array<String>) {

    var successCount = 0L
    var loopRange = 100_000L
    var range = 1..loopRange
    var sum = 0
    var temp = 0
    for (i in range){

        sum = randomInt(1, 6) + randomInt(1, 6)

        if(sum == 7 || sum == 11)
            successCount++

        else if (sum == 2 || sum == 3 || sum == 12)
            println("Craps with ${sum}!")
        else
        {
            do{
                temp = sum
                if (temp ==  randomInt(1, 6) + randomInt(1, 6)){
                    successCount++
                    break
                }
            }while (temp != 7)
        }
    }
    println("Win posibility : ${successCount.toDouble() / loopRange}")
}