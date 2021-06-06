/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

interface Hoge
interface Fuga
interface Piyo: Hoge, Fuga
class Foo<T>
class Bar<T: Hoge>
class Baz<T> where T: Hoge, T: Fuga


fun main(args: Array<String>) {
    val intContainer: Container<Int> = Container(123)
    val i: Int = intContainer.value
    println(i * 2)
    
    val strContainer = Container("Hello")
    val s = strContainer.value.toUpperCase()
    println(s)
        
    val container: Container<Int> = box(5)
    
    
    Foo<Hoge>()
    Foo<Fuga>()
    Bar<Hoge>()
    Baz<Piyo>()
    
}

fun <T> box(value: T): Container<T> =
    Container(value)

class Container<T>(var value: T)
