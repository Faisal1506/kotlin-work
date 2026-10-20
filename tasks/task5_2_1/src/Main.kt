// Task 5.2.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>){
    if(args.size != 1){
        println("Error: 1 input is needed")
        exitProcess(1)
    }

    val a = args[0].toDouble()

    val ca = circleArea(a)
    val cp = circlePerimeter(a)

    println("Area = %.4f and Perimeter = %.4f". format(ca,cp))
}
