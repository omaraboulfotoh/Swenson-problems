import org.junit.Test
import kotlin.test.assertEquals

internal class FibonacciKtTest {


    @Test
    fun fibonacciStressTest() {
        // unique set of numbers.
        // small numbers, because recursive version will take longer time.
        val numbers = (0..30).map { (0..20).random() }.distinct()
        numbers.forEach { n ->
            val rec_fib = fibonacciRecursive(n)
            val dp_fib = fibonacciDp(n)

            assertEquals(
                expected = rec_fib,
                actual = dp_fib,
                message = "for $n: recursion: $rec_fib, \t dynamic: $dp_fib"
            )
        }
    }

    @Test
    fun fibonacci_dp() {
    }
}