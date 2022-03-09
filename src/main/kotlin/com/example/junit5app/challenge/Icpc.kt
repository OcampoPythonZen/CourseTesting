package com.example.junit5app.challenge

import com.example.junit5app.example.models.truncate

fun main() {

    val str = "DOLORES HIDALGO CUNA DE LA INDEPENDENCIA NACIONAL"
    println(str)
    val newString = str.truncate()
    println(newString)

}

private fun readInt() = readLine()!!.toInt()
private fun readInts() = readLine()!!.split(" ").map { it.toInt() }
