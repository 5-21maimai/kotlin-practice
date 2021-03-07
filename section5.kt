/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

fun main(args: Array<String>) {
    val result = succ(31)
    println(result)
    
    println(square(5))
    
    println(hello("Alice"))
    println(hello())
    
    println(max(12, 13))
    
    println(sum(arrayOf(1, 2, 3)))
    println(sum(1, 2, 3))
    println(sum(*intArrayOf(1, 2, 3)))
    
    println(sub(subtrahend = 2, minuend = 6))
    
    println(sum(numbers = listOf<Long>(1, 2, 3, 4, 5)))
}

fun succ(i: Int): Int = i + 1
fun square(i: Int): Int = i * i

fun hello(name: String = "World"): String = "Hello, $name!"

fun max(a: Int, b: Int): Int = if(b <= a) a else b

fun sum(ints: Array<Int>): Int {
    var sum = 0
    for (i in ints) {
        sum += i
    }
    return sum
}

fun sum(vararg ints: Int): Int {
    var sum = 0
    for (i in ints) {
        sum += i
    }
    return sum
}

fun sum(numbers: List<Long>): Long {
    tailrec fun go(numbers: List<Long>, accumulator: Long = 0): Long =
		if (numbers.isEmpty()) accumulator
		else go(numbers.drop(1), accumulator + numbers.first())
    return go(numbers, 0)
}


fun sub(minuend: Int, subtrahend: Int): Int =
	minuend - subtrahend

class Counter {
    private var cnt = 0
    
    fun countUp(): Unit {
        cnt++
    }
    
    fun getCount(): Int = cnt
}




