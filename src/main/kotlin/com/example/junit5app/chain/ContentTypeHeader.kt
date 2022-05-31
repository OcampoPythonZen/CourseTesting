package com.example.junit5app.chain

class ContentTypeHeader(val content: String?, var next: HandlerChain? = null) : HandlerChain {
    override fun addHeader(inputHeader: String): String = "$inputHeader\nContent-Type: $content"
        .let { next?.addHeader(it) ?: it }
}
