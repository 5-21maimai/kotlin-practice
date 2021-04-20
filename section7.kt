/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

interface Bucket {
    fun fill()
    fun drainAway()
    fun pourTo(that: Bucket)
    
    val capacity: Int
    val quantity: Int
}


fun main() {
    val bucket1 = createBucket(7)
    val bucket2 = createBucket(4)
    val bucket3 = BucketImpl(6)
    
    bucket1.fill()
    bucket2.fill()
    bucket3.fill()
    
    println(bucket1.quantity)
    println(bucket2.quantity)
    println(bucket3.quantity)
    
    bucket1.drainAway()
    bucket3.drainAway()
    
    println(bucket1.quantity)
    println(bucket2.quantity)
    println(bucket3.quantity)
    
}

fun createBucket(_capacity: Int): Bucket = object : Bucket {
    override var quantity: Int = 0
    override val capacity = _capacity
    
    override fun fill() {
        quantity = capacity
    }
    
    override fun drainAway() {
        quantity = 0
    }
    
    override fun pourTo(that: Bucket) {
        
    }
}

class BucketImpl(_capacity: Int): Bucket {
    override var quantity: Int = 0
    override val capacity = _capacity
    
    override fun fill() {
        quantity = capacity
    }
    
    override fun drainAway() {
        quantity = 0
    }
    
    override fun pourTo(that: Bucket) {
        
    }
}
