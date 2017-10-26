/**
 *
 *@author Destan_Erik on 19:18 , 2 Ağustos 2017
 *
 */

package homework.homework13

/*Homework - Kotlin - 005 - 1 */

fun getInputAsInt(message : String) : Int{
    print(message)
    return readLine()!!.toInt()
}
fun getMinimum(control : Int , number : Int) = if (number < control) number else control
fun getMaximum(control : Int , number : Int) = if (number > control) number else control
fun calculateAverage(sum : Int , quantity : Int) = sum / quantity.toDouble()

fun main(args: Array<String>){

    var number = 0
    var minimum = 100
    var maximum = 0
    var sum = 0
    var count = 0
    var flag : Boolean

    do {

        var choice = getInputAsInt("To enter new number press (1) else press (0) :")

        if (choice == 1){
            number = getInputAsInt("Enter new integer:")
            flag = true

                if ((number > 100 || number < 0))
                    println("Invalid number.The range must be in [0,100]")
                else
                {
                    count = count.inc()
                    sum += number
                    minimum = getMinimum(minimum, number)
                    maximum = getMaximum(maximum, number)
                }
        }
        else if(choice == 0)
        {
            flag = false
            println("-----------------------------------------")
            println("Totally, $count value(s) entered.")
            println("Maximum value = $maximum")
            println("Minimum value = $minimum")
            println("Average = ${calculateAverage(sum, count)}")
            println("The program is terminated.")
            println("-----------------------------------------")
        }
        else
        {
            flag = true
            println("Invalid state you entered.")
        }

    }while (flag)
}