class Solution {
    fun isPowerOfThree(n: Int): Boolean {
        val base3 = n.toString(3)
        val reg = Regex("^10*$")
        return base3.matches(reg)
    }
}