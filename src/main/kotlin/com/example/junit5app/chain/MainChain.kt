package com.example.junit5app.chain

fun main() {
    val authHeader = AuthHeader("da4FS4343dsfSD98437")
    val contentTypeHeader = ContentTypeHeader("application/json")
    val bodyPayloadHeader = BodyPayloadHeader(mapOf("age" to 35))

    authHeader.next = contentTypeHeader
    contentTypeHeader.next = bodyPayloadHeader
}
