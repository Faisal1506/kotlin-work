// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess
import java.nio.file.NoSuchFileException

fun main(args: Array<String>) {
    if(args.size != 1){
        println("Error: 1 argument needed")
        exitProcess(1)
    }

    try {
        val data = readData(args[0])
        val vari = variance(data)
        println("variance: %.5f".format(vari))
    }
    catch (error: NoSuchFileException){
        println("Error: file dosent exist")
        exitProcess(1)
    }
    catch(error: NumberFormatException){
        println("Error: No valid numbers in the file")
        exitProcess(1)
    }
    catch(error: IllegalArgumentException){
        println("Too few values")
        exitProcess(1)
    }
    catch(error: Exception){
        println("Error")
        exitProcess(1)
    }
}
