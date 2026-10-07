// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(args: Array<String>){
    if (args.size != 3){
        println("Error: Must need all 3 values")
        exitProcess(1)
    }

    var a =args[0].toDouble()
    var b= args[1].toDouble()
    var c= args[2].toDouble()

    val total = a+b+c
    val averge = (total / 3).roundToInt()

    val grade = when (averge){
        in 0..39 -> println("Fail")
        in 40..69 -> println("Pass")
        in 70..100 -> println("Distinction")
        else -> println("?")
    }
}