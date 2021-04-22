/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

class MyClass {
    leteinit var foo: String
}

class Greeter {
    fun greet(name: String) {
        println("Hello, $name!")
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
    
}

