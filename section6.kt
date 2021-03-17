/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

fun square(i: Int) = i * i

fun main(args: Array<String>) {
    val functionObject = ::square
    println(functionObject(5))
    
    
    println(firstK("hogeKfuga"))
    println(firstUpperCase("hogefUga"))
    println(firstWhitespace("hogefug a"))
    
    val square: (Int) -> Int = { i: Int ->
    	i * i
    }
    
    val square1 = { i: Int ->
    	i * i
    }
    
    val square2: (Int) -> Int  = { i ->
    	i * i
    }
    
    val square3: (Int) -> Int  = {
    	it * it
    }
    
}

fun first(str: String, precidate: (Char) -> Boolean): Int {
    tailrec fun go(str: String, index: Int): Int =
    	when {
            str.isEmpty() -> -1
            precidate(str.first()) -> index
            else -> go(str.drop(1), index + 1)
        }
    return go(str, 0)
}

fun firstK(str: String): Int {
    fun isK(c: Char): Boolean = c == 'K'
    return first(str, ::isK)
}

fun firstUpperCase(str: String): Int {
    fun isUpperCase(c: Char): Boolean = c.isUpperCase()
    return first(str, ::isUpperCase)
}

fun firstWhitespace(str: String): Int = first(str) { it.isWhitespace() }

