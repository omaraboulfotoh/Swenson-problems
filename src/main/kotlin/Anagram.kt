/**
 *
 */
fun isAnagram(first: String, second: String): Boolean {
    // make sure no string, the second string will be checked in the next if.
    if (first.isEmpty()) {
        return false
    }

    // make sure that the two strings are the same length.
    if (first.length != second.length) {
        return false
    }
    val firstSorted = first.toLowerCase().toCharArray().sorted()
    val secondSorted = second.toLowerCase().toCharArray().sorted()

    return firstSorted == secondSorted
}