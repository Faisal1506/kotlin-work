// Task 5.1.2: main program
import kotlin.system.exitProcess

fun main(args: Array<String>){
    if (args.size == 0){
        rollDie()
    }
    else if (args.size == 1){
        rollDie(args[0].toInt())
    }
    else{
        println("Error: 1 input needed")
        exitProcess(1)
    }

}