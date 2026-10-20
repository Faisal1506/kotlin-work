// Task 5.1.2: rollDie() function
import kotlin.random.Random

fun rollDie(sides: Int = 6){
    if (sides in setOf(4, 6, 8, 10, 12, 20)){
        println("Rolling a d$sides...")
        val results = Random.nextInt(1, sides + 1)
        println("You Rolled $results")
    }
    else{
        println("Error: cannot have a $sides-sided die")
    }
}