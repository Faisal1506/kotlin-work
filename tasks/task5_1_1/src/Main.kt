// Task 5.1.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>){
    if (args.size != 2){
        println("2 words needed")
        exitProcess(1)
    }

    val a = args[0]
    val b = args[1]

    if (anagrams(a,b)){
        println("$a and $b is a anagram")
    }
    else{
        println("$a and $b is not a anagram")
    }
}
