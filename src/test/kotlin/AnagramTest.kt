import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class AnagramTest {


    private val anagramExamples = hashMapOf(
        "Tar" to "Rat",
        "Arc" to "Car",
        "Elbow" to "Below",
        "State" to "Taste",
        "Cider" to "Cried",
        "Dusty" to "Study",
        "Night" to "Thing",
        "Inch" to "Chin",
        "Brag" to "Grab",
        "Cat" to "Act",
        "Bored" to "Robed",
        "Save" to "Vase",
        "Angel" to "Glean",
        "Stressed" to "Desserts",
    )

    private val nonAnagramExamples = hashMapOf(
        "" to "none", // first word is empty.
        "none" to "", // second word is not empty.
        "twoooo" to "thre", // mismatched lengths.
        "same" to "fame" // same length strings.
    )

    @Test
    fun anagramTest() {

        anagramExamples.forEach { (first, second) ->
            assertTrue(isAnagram(first, second))
        }
    }

    @Test
    fun nonAnagramTest() {
        nonAnagramExamples.forEach { (first, second) ->
            assertFalse(isAnagram(first, second))
        }
    }
}