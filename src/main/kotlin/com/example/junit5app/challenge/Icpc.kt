package com.example.junit5app.challenge

fun main() {

    /*val str = "DOLORES HIDALGO CUNA DE LA INDEPENDENCIA NACIONAL"
    println(str)
    val newString = str.truncate()
    println(newString)*/

    val input = readLine()!!.toInt()

    val map = mapOf<String, Any>(
        "usd_max_amount" to if (input is Int) input.toDouble() else 0.0
    )

    println(map)

}

private fun readInt() = readLine()!!.toInt()
private fun readInts() = readLine()!!.split(" ").map { it.toInt() }
