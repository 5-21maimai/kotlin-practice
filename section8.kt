/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

class MyClass {
    // leteinit var foo: String
}

class Greeter {
    fun greet(name: String) {
        println("Hello, $name!")
    }
}

class Rational(val numerator: Int, val denominator: Int) {
    constructor(numerator: Int) : this(numerator, 1)
    
    init {
        require(denominator != 0)
    }

}

class Person {
    var name: String = ""
    	set(value) {
            println("${value}がセットされました")
            field = value
        }
    
    var age: Int = 0
    val nameLength: Int
    	get() = this.name.length
}


fun main(args: Array<String>) {
    var myClass = MyClass()
    println(myClass)
    
    var greeter = Greeter()
    greeter.greet("Kotlin")
    
    val hanako = Person()
    println(hanako.name)
    println(hanako.age)
    
    hanako.name = "花子"
    hanako.age = 25
    
    println(hanako.name)
    println(hanako.age)
    println(hanako.nameLength)
    
    val half = Rational(1, 2)
    println(half.numerator)
    println(half.denominator)
    
    val five = Rational(5)
    println(five.numerator)
    println(five.denominator)
    
    println("I like Kotlin".countWords())
    
    Rational(1, 0)

    
}

fun String.countWords(): Int =
    this.split("""\s+""".toRegex()).size

