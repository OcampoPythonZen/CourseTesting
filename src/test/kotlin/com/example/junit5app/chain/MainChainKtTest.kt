package com.example.junit5app.chain

import org.junit.jupiter.api.Test

internal class MainChainKtTest {

    @Test
    fun `Testing the chain of responsability design pattern with kotlin`() {

        val authHeader = AuthHeader("da4FS4343dsfSD98437")
        val contentTypeHeader = ContentTypeHeader("application/json")
        val bodyPayloadHeader = BodyPayloadHeader(mapOf("age" to 35))

        authHeader.next = contentTypeHeader
        contentTypeHeader.next = bodyPayloadHeader

        val messageWithAuth = authHeader.addHeader("Request with Auth")
        println(messageWithAuth)

        println("-------------------------------")

        val messageWithoutAuth = contentTypeHeader.addHeader("Request without Auth")
        println(messageWithoutAuth)
    }
}