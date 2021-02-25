/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

class Rational(val n: Int, val d: Int) {
    
    init {
        require(d != 0, {"denominatorに0はダメです"})
    }
    
    private val g = gcd(Math.abs(n), Math.abs(d))
    val numerator: Int = n / g
    val denominator: Int = d / g
    
    operator fun plus(that: Rational) =
    	Rational(
            numerator * that.denominator + that.numerator * denominator,
            denominator * that.denominator
        )
    operator fun plus(n: Int): Rational =
    	Rational(
            numerator + n * denominator, denominator
        )
    
    override fun toString(): String = "${numerator}/${denominator}"
    
    tailrec private fun gcd(a: Int, b: Int): Int =
    	if (b == 0) a
    	else gcd(b, a % b)
    
}

operator fun Int.plus(r: Rational): Rational = r + this

fun main(args: Array<String>) {
    var half = Rational(1,2)
    println(half.denominator)
    println(half)
    println(half.toString())
    
    println(Rational(17,17))
    println(Rational(50,100))
    
   	println(Rational(1,4) + (Rational(1,2)))
    println(Rational(1,4) + 1)
    println(3 + (Rational(2,1)))
    
    println(Rational(1,0))
}
