/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */


fun main(args: Array<String>) {
    if(true) {
        println("Hello")
    }
    
    if(5 in 1..10) {
        println("5 in 1~10")
    }
    
    if(1 + 2 < 3) {
        println("hoge")
    }
    
    val score = 50
    if(score >= 60) {
        println("合格")
    } else {
        println("不合格")
    }
    
    val message = if(score >= 60) "合格" else "不合格"
    println(message)
    
    val x = if(true) {
        1
        2
    } else {
        3
    }
    println(x)
    
    val score2 = 75
    val grade =
    	if(score2 >= 90) 'A'
    	else if(score2 >= 80) 'B'
    	else if(score2 >= 70) 'C'
    	else if(score2 >= 60) 'D'
    	else 'F'
    println(grade)
    
    when(x) {
        1 -> "one"
        2, 3 -> "two or three"
        else -> {
            "unknown"
        }
    }
    
    when(x) {
        1 -> "one"
        in 2..10 -> "1 <= x <= 10"
        else -> {
            "unknown"
        }
    }
    
    val y = "hoge"
    val blank = when(y) {
        is String -> y.isBlank()
        else -> true
    }
    
    val grade2 =
        when {
            score2 >= 90 -> 'A'
            score2 >= 80 -> 'B'
            score2 >= 70 -> 'C'
            score2 >= 60 -> 'D'
            else         -> 'F'
        }
    println(grade2)
}
