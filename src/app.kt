//Read Only Variable
val PI = 3.14
//Can Reassigned Variable
var x = 0
//Read Only Variable pass Function called
val sum_result: Int = sum(2, 3)
val minus_result: Int = minus(3,4)
var divisor: Int = 0
var dividend: Int = 0
var quotient: Int = 0
var remainder: Int = 0
//Example datatype


//Main Function
fun main()
{
    printHelloWorld()
    println("Increment of X: " + incrementX())
    println("Sum Result: " + sum_result)
    println("Minus Result: " + minus_result)
    multiply(3, 2)
    oddandeven(102)
    oddandeven(43)
    quotient()
    remainder()
    swapnumber()
    findlargenumber()
    sumofnaturalnum()
    checkleapyear()
    factorial()
    multiplicationtable()
    vowelorconsonant()
}

//Increment inferred variable x
fun incrementX(): Int {
    x += 1
    return x
}

//Function return no meaningful value
fun printHelloWorld(): Unit
{
    println("Hello World")
}

//Function with expression body and infered return type
fun minus(a: Int, b: Int) = a - b

//Function have two int return int return type
fun sum(a: Int, b: Int): Int {
    return a + b
}

//Basic void function
fun multiply(a: Int, b: Int)
{
    //Example String templates
    println("Multiplication of $a and $b is ${a * b}")
}

fun quotient()
{
    dividend = 100
    divisor = 2
    quotient = dividend / divisor
    println("Quotient = " + quotient)
}

fun remainder()
{
    dividend = 103
    divisor = 2
    remainder = dividend % divisor
    println("Remainder = " + remainder)
}

//Conditional
fun oddandeven(a: Int)
{
    if (a % 2 == 0)
    {
        println("$a is even number")
    }
    else
    {
        println("$a is odd number")
    }
}

fun vowelorconsonant()
{
    var c: Char? = 'A'
    val isLowercaseVowel: Boolean
    val isUppercaseVowel: Boolean
    // evaluates to 1 (true) if c is a lowercase vowel
    isLowercaseVowel = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
    // evaluates to 1 (true) if c is an uppercase vowel
    isUppercaseVowel = (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
    if (isLowercaseVowel || isUppercaseVowel)
    {
        println("$c is a vowel.")
    }
    else
    {
        println("$c is a consonant.")
    }
}

fun findlargenumber()
{
    val n1: Int = 10
    val n2: Int = 30
    println("Large Number is: " + Math.max(n1, n2))

}

fun swapnumber()
{
    var a: Int = 11
    var b: Int = 12
    var temp: Int
    println("Before swapping. a = $a, b = $b")
    temp = a
    a = b
    b = temp
    println("After swapping. a = $a, b = $b")
}

fun sumofnaturalnum()
{
    var a: Int = 2
    var sum: Int = 0
    for (i in 1..a) {
        sum += i
    }
    println("Sum = " + sum)
}

fun checkleapyear()
{
    var year: Int = 2000
    if(year % 4 == 0)
    {
        if(year % 100 == 0)
        {
            if(year % 400 == 0)
            {
                println("$year is a leap year.")
            }
            else
            {
                println("$year is not a leap year.")
            }
        }
        else
        {
            println("$year is a leap year.")
        }
    } else
    {
        println("$year is not a leap year.")
    }
}

fun factorial()
{
    var n:Int = 3
    var factorial:Long = 1
    for (i in 1..n)
    {
        factorial *= i
    }
    println("Factorial of $n = $factorial")
}

fun multiplicationtable()
{
    var n:Int = 10
    for (i in 1..10)
    {
        println("$n x $i = $n * $i")
    }

}