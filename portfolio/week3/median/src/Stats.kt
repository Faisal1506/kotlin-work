// Task 7.7.1: statistics functions
fun median(values: List<Float>): Float{
    require(values.size > 0)
    val sorted = values.sorted()
    val mid = sorted.size / 2

    if (sorted.size % 2 == 0){
        val x = sorted[mid-1]
        val y = sorted[mid]
        val middle = (x+y) /2
        return middle
    }else{
    return sorted[mid]
}
}


fun display(values: List<Float>){
    println("Minimum: %.2f".format(values.min()))
    println("Maximum: %.2f".format(values.max()))
    println("Mean: %.2f".format(values.average()))
    println("Median: %.2f".format(median(values)))
}