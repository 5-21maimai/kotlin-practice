/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */


fun main(args: Array<String>) {
    var foo: Int = 123
    println(foo)
    println(foo + 5)
    
    foo = 3
    println(foo)
    
    val bar: String = "Hello"
    println(bar)
    
    val int: Int = 123
    val long: Long = int.toLong()
    println(long)
    println(75.toChar())
    
    val name = "Taro"
    println("Hello, " + name + "!")
    println("Hello, $name!")
    
    println("""
    	Hello, $name!
    """)
    println("""
    	|It's
        |sunny
        |today.
    """.trimMargin())
    
    
    val ints = arrayOfNulls<Int>(5)
    println(ints.size)
    println(ints[0])
    ints[0] = 123
    println(ints[0])
    
    val strs = arrayOf("red", "green", "blue")
    println(strs[0])
    
    val intList = listOf<Int>(1, 2, 3)
    println(intList)
    println(intList.size)
    println(intList[0])
    
    val charList: MutableList<Char> = mutableListOf('a', 'b')
    println(charList)
    charList[0] = 'c'
    println(charList)
    
    charList += 'X'
    println(charList)
    charList -= 'X'
    println(charList)
    charList.removeAt(0)
    println(charList)
    
    val intSet: Set<Int> = setOf(1, 2, 1, 3)
    println(intSet)
    val charSet: MutableSet<Char> = mutableSetOf('a', 'a', 'b')
    println(charSet)
    charSet -= 'a'
    println(charSet)
}
