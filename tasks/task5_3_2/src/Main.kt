// Task 5.3.2: main program
import kotlin.system.exitProcess

fun main(args: Array<String>){
    if (args.size == 0){
        rollDice()
    }
    else if(args.size == 1){
        val parts = args[0].split("d")
        rollDice(dice=parts[0].toInt(), sides=parts[1].toInt())
    }
    else{
        println("Error: At most 1 inputs")
        exitProcess(1)
    }
}