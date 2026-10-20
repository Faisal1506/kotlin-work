// Task 5.3.2: rollDice() function
import kotlin.random.Random

fun rollDice(sides: Int = 6, dice: Int = 1){
    if (sides in setOf(4, 6, 8, 10, 12, 20)){
        println("Rolling a d$sides and $dice dice...")
        var total = 0
        for (i in 1..dice){
            val roll = Random.nextInt(1, sides+1)
            total += roll
        }
        println("... $total")
    }
    else{
        println("Error: cannot have a $sides-sided die")
    }
}