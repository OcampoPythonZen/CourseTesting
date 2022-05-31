package com.example.junit5app.chain

class AuthHeader(val token: String?, var next: HandlerChain? = null) : HandlerChain {
    override fun addHeader(inputHeader: String): String =
        "$inputHeader\nAuthorization: Basic $token"
            .let { next?.addHeader(it) ?: it }

}
