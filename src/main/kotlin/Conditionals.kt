fun main() {
    var num: Int = 10

    // conventional if-else statement. same with Java
    if (num == 10) {
        num = num.inc()
    } else if(num > 10) {
        num = num.dec()
    } else {
        num *= 5
    }

    // if-else can be used to directly assign value to a variable
    val str: String = if (num == 10) {
        "num is 10"
    } else {
        "num is not 10"
    }
    println(str)

    // when expression: convenient way of complex if-else statement
    val ans = when {
        num == 10 -> "num update didn't work"
        num > 10 -> "num update worked"
        else -> "I hate Kotlin"
    }
    println(ans)
}