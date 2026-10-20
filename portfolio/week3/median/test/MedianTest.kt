// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    "1 element"{
        median(listOf(6f)) shouldBe 6f
    }

    "2 element"{
        median(listOf(6f, 2f)) shouldBe 4f
    }

    "3 element"{
        median(listOf(6f, 2f, 8f)) shouldBe 6f
    }

    "4 element"{
        median(listOf(6f, 2f, 8f, 3f)) shouldBe 4.5f
    }
})
