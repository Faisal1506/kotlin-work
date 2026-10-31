// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    @Test
    fun `mark of 55 gives a Pass`(){
    assertEquals("Pass", grade(55))
    }

    @Test
    fun `mark of -1 gives a ?`(){
        assertEquals("?", grade(-1))
    }

    @Test
    fun `mark of 20 gives a Fail`(){
        assertEquals("Fail", grade(20))
    }

    @Test
    fun `mark of 85 gives a Distinction`(){
        assertEquals("Distinction", grade(85))
    }

    @Test
    fun `mark of 120 gives a ?`(){
        assertEquals("?", grade(120))
    }
}
