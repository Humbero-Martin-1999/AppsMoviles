package com.example.workclass.Class

//class variable {
//}

fun main (){
    //Numeric variables
    val age:Int = 20
    val long_number:Long = 3513446164
    val temperature:Float = 27.33f
    val weight:Double = 64.125

    //String variables
    val gender:Char = 'M'
    val name:String = "Humberto Martin"

    //Bool variables
    val isGreater:Boolean = false

    //Collection variables
    val names = arrayOf("Josue","Ana ","Victoria" , "Sebas")

    println(age)

    println("Welcome $name, to your first Kotlin Project")
    println( add())

    println(product(5,8))

    printArray(names)

    val numbers = arrayOf(1,2,3,4,5,6,7,8,9,10)


}

fun add():Int{
    val x = 18
    val y = 8
    return (x+y)
}

fun product(x:Int,y:Int):Int{
    return (x*y)
}

fun printArray(names:Array<String>) {
    for (name in names) {
        println("Hello $name, ")

    }


    fun isEven(numbers: Array<Int>) {
        for (number in numbers) {
            if (number % 2 == 0) {
                println("The number $number is even")
            } else {
                println("The number $number is odd")
            }

        }
    }
}
