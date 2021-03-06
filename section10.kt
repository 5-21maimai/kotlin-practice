/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

interface Greeter {
    val language: String
    fun sayHello(target: String)
}

class EnglishGreeter: Greeter {
    override val language = "English"
    override fun sayHello(target: String) {
        println("Hello, $target!")
    }
}

fun main(args: Array<String>) {
    EnglishGreeter().sayHello("Kotlin")
    
}

interface Foo {
    fun execute()
}

interface Bar {
    fun execute()
}

class FooBar: Foo, Bar {
    override fun execute() {
        println("Foobar")
    }
}

open class SuperClass {
    open fun execute() {
        println("SuperClass")
    }
}

class FooSubclass: SuperClass(), Foo

interface Hoge {
    fun execute() {
        println("Hoge")
    }
}

interface Fuga {
    fun execute() {
        println("Fuga")
    }
}

class HogeFuga: Hoge, Fuga {
    override fun execute() {
        super<Hoge>.execute()
    }
}

interface Fooo {
    fun aaa()
    fun bbb()
}

interface Baar: Fooo {
    override fun aaa () {}
    fun ccc()
}

class Baz: Baar {
    override fun bbb(){}
    override fun ccc(){}
}

interface Greeter2 {
    fun sayHello(target: String)
    fun sayHello()
}

class JapaneseGreeter: Greeter2 {
    override fun sayHello(target: String){}
    override fun sayHello(){}
}

class JapaneseGreeterWithRecording(private val greeter: Greeter2): Greeter2 by greeter {
    
    private val _targets: MutableSet<String> = mutableSetOf()
    
    val targets: Set<String>
    	get() = _targets
    
    override fun sayHello(){
        greeter.sayHello()
    }
    
    override fun sayHello(target: String){
        _targets += target
        greeter.sayHello(target)
    }
                                
}
