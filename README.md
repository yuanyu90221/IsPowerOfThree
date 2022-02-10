# IsPowerOfThree

Write a method to judge whether an input number is power of three

## 我的解法

如同 isPowerOfTwo 一樣

可以知道 如果轉成 base3

假設是 3 的次方數 會符合 10*$ 這樣的模式

```kotlin
class Solution {
    fun isPowerOfThree(n: Int): Boolean {
        val base3 = n.toString(3)
        val reg = Regex("^10*$")
        return base3.matches(reg)
    }
}
```