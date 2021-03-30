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
    
    val counter1 = getCounter()
    val counter2 = getCounter()
    println(counter1())
    println(counter1())
    println(counter2())
    println(counter1())
    println(counter2())
    
    log{"出力"}
    log(false){"出力されない"}
    
    println(containDigit("abc123"))
    println(containDigit2("abc123"))
    
    val square4: (Int) -> Int = fun(i: Int) = i * i
    
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

fun getCounter(): () -> Int {
    var count = 0
    return {
        count++
    }
}

inline fun log(debug: Boolean = true, message: () -> String) {
    if(debug) {
        println(message())
    }
}


inline fun forEach(str: String, f: (Char) -> Unit) {
    for (c in str) {
        f(c)
    }
}

fun containDigit(str: String): Boolean {
    forEach(str) {
        if (it.isDigit())
        return true
    }
    return false
}

fun containDigit2(str: String): Boolean {
    var result = false
    forEach(str) {
        if (it.isDigit()) {
            result = true
            return@forEach
        }
    }
    return result
}

