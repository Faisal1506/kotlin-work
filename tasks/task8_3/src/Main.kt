// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 1){
        println("Error: Only 1 argument is needed")
        exitProcess(1)
    }

    val data = fetchData(args[0])

    val coldest = data.minBy {it.second}
    val hottest = data.maxBy {it.second}
    val average = averageTemp(data)

    println("Coldest: ${coldest.first} at ${coldest.second}")
    println("Hottest: ${hottest.first} at ${hottest.second}")
    println("Averge temp: %.2f".format(average))


}
