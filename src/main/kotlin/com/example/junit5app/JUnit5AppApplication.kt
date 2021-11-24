package com.example.junit5app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JUnit5AppApplication

fun main(args: Array<String>) {
    runApplication<JUnit5AppApplication>(*args)
}
