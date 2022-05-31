package com.example.junit5app.chain

class BodyPayloadHeader(private val bodyMap: Map<String, Any>, var next: HandlerChain? = null) : HandlerChain {
    override fun addHeader(inputHeader: String): String = "$inputHeader\nBody: $bodyMap"
        .let { next?.addHeader(it) ?: it }
}
