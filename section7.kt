/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

interface Bucket {
    fun fill()
    fun drainAway()
    fun pourTo(that: Bucket)
    
    fun getCapacity(): Int
    fun getQuantity(): Int
    fun setQuantity(quantity: Int)
}


fun main() {
    val bucket1 = createBucket(7)
    val bucket2 = createBucket(4)
    
    bucket1.fill()
    bucket2.fill()
    
    println(bucket1.getQuantity())
    println(bucket2.getQuantity())
    
    bucket1.drainAway()
    
    println(bucket1.getQuantity())
    println(bucket2.getQuantity())
    
}

fun createBucket(capacity: Int): Bucket = object : Bucket {
    var _quantity: Int = 0
    
    override fun fill() {
        setQuantity(getCapacity())
    }
    
    override fun drainAway() {
        setQuantity(0)
    }
    
    override fun pourTo(that: Bucket) {
        
    }
    
    override fun getCapacity(): Int = capacity
    
    override fun getQuantity(): Int = _quantity
    
    override fun setQuantity(quantity: Int) {
        _quantity = quantity
    }
}
