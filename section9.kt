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
}

open class Person(val name: String) {
    fun introduceMyself() {
        println("I am $name.")
    }
}

class Student(name: String, val id: Long): Person(name)

