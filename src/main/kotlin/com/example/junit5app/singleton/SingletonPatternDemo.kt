package com.example.junit5app.singleton
/*
Limitar a una unica instancia en toda la aplicacion a ciertos objetos
a esto se le conoce como Creational Singleton Pattern.
*/

object SingletonPatternDemo {

    init {
        println("Singleton  init object invoked.")
    }

    var nameOnObject = "Kotlin Object Variable"
    fun printName(): String = nameOnObject
}


fun main(args: Array<String>) {

    //Calling to the Singleton Object.
    val sampleObject = SingletonPatternDemo.hashCode()
    println("Value of hash Code object instance one is: $sampleObject")

    //Calling to the Singleton Object with other instance variable.
    val sampleObject2 = SingletonPatternDemo.hashCode()
    println("Value of hash Code object instance two is: $sampleObject2")

    //Calling to the Singleton Object Function.
    println(SingletonPatternDemo.printName())

    //Re-assigment of Singleton variable
    SingletonPatternDemo.nameOnObject = "Kotlin Programming"

    //Instantiation of a simple class
    val sampleClass = SampleClass().hashCode()
    val sampleClass2 = SampleClass().hashCode()
    println("Value of hash Code instance one is: $sampleClass and hash code of instance two is: $sampleClass2")
}


class SampleClass {
    init {
        println("Class init method Singleton Name property: ${SingletonPatternDemo.nameOnObject}")
    }
}
