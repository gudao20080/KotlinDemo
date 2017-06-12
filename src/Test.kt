/**
 * Created by WangKai on 2017/4/6.
 */


fun sum(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int) {

    val a: Int = 1
    val b = 2
    val c: Int
    c = 10

    var x = 5

    x += 1
    /*
        多行注释
     */
    println("sum of $a and $b is ${a + b}")

    var e = 1
    val s1 = "a is $e"

    e = 3
    val s2 = "${s1.replace("is", "was")}, but now is $e"
    println(s2)

    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }
}

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun parseInt(str: String): Int? {
    return null
}


fun describe(obj: Any): String =
        when (obj) {
            1 -> "one"
            "hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }

    return null
}

fun rangeLimitation() {
    val x = 10
    val y = 20

    if (x in 1..y + 1) {
        println("fits in range")
    } else {
        println("dot fit ")
    }

    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }

    val items = listOf("apple", "banana", "kiwi")
    when {
        "apple" in items -> println("apple")

    }

    items.filter { it.startsWith("a", true) }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}

fun foo(a: Int = 1, b: Int = 2) {
    println("a + b is ${a + b}")
}

object Resource{
    var name = "Name"
}

class Turtle {
    fun penDown(){}
    fun penUp(){}
    fun turn(degrees: Double){}
    fun forward(pixels: Double){}
}


fun dodd() {
    val myTurtle = Turtle()
    with(myTurtle) { // 描绘一个边长 100 像素的正方形
        penDown()
        for(i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }
}
enum class RGB { RED, GREEN, BLUE }

fun foo() {
    val data: String by lazy { "aaaa"  }
    if (3 > 0) {
        println(data)
    }
    print(enumValues<RGB>().joinToString { it.name })
}

