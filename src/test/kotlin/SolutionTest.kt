import kotlin.test.Test
import kotlin.test.assertEquals

internal class SolutionTest {
    private val sol: Solution = Solution()
    @Test
    fun isPowerOfThreeExample1() {
        assertEquals(true ,sol.isPowerOfThree(27))
    }
    @Test
    fun isPowerOfThreeExample2() {
        assertEquals(false ,sol.isPowerOfThree(0))
    }
    @Test
    fun isPowerOfThreeExample3() {
        assertEquals(true ,sol.isPowerOfThree(9))
    }
}