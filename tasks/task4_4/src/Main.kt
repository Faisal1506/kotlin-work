// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    if (args.size !=3){
        println("Error: 3 inputs Needed")
        exitProcess(1)
    }

    var a = args[0].toDouble()
    var b = args[1].toDouble()
    var c = args[2].toDouble()
    var temp = a

    while(temp <= b){
        var tempF = (temp*9 / 5 + 32).toDouble()
        println("%.1f C = %.1f F".format(temp, tempF))
        temp = temp+c
    }
}
