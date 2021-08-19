fun main() {
    val num: Int = 10
    println(func(num))
    println(simplifiedFunc(num))
    println(noReturnFunc(num))
    println(anonyFunc(num))

    println(higherOrderFunc("length", { str -> str.length }))

    // if anonymous function is the last parameter defined on a function, it can be passed out of the parantheses
    println(higherOrderFunc("length") { str -> str.length })
}

// function declaration
fun func(i: Int): String {
    val v = if (i > 10) {
        11
    } else {
        10
    }
    return v.toString()
}

// if the result from single expression is returned, it can be simplified by directly returning
fun simplifiedFunc(i: Int): String {
    return if (i > 10) {
        "11"
    } else {
        "10"
    }
}

// return statement can be replaced with the assignment operator
fun noReturnFunc(n: Int): String = if (n > 5) {
    "gt 5"
} else {
    "le 5"
}

// anonymous function
val anonyFunc: (Int) -> String = { i ->
    i.toString()
}

// higher-order function accepts another function as an argument
fun higherOrderFunc(str: String, callback: (String) -> Int): Int {
    return callback(str)
}