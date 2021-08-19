fun main() {
    var num: Int = 10
    println(num)
    num = num.inc()
    println(num)



    // null is only allowed when the type is followed by ? mark
    val str: String? = null

    // str? expression works only if str is non null value
    // if str is null, then value after elvis operator (?:) is assigned
    val len = str?.length ?: 0
    println(len)
}