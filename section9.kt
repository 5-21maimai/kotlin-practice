/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */


fun main(args: Array<String>) {
    val person: Person = Person("hanako")
    person.introduceMyself()
    
    val student: Student = Student("taro", 123)
    println(student.name)
    println(student.id)
    student.introduceMyself()
    
    val person2: Person = Student("jiro", 124)
    person2.introduceMyself()
    
    EnglishGreeter("Kotlin").sayHello()
    JapaneseGreeter("Java").sayHello()
    
}

open class Person(open val name: String) {
    open fun introduceMyself() {
        println("I am $name.")
    }
}

class Student(override val name: String, val id: Long): Person(name) {
    override fun introduceMyself() {
        println("I am $name(id=$id)")
        super.introduceMyself()
    }
}

abstract class Greeter(val target: String) {
    abstract fun sayHello()
}

class EnglishGreeter(target: String): Greeter(target) {
    override fun sayHello() {
        println("Hello, $target!")
    }
}

class JapaneseGreeter(target: String): Greeter(target) {
    override fun sayHello() {
        println("こんにちは、 $target!")
    }
}
