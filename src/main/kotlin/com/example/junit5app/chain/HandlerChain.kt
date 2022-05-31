package com.example.junit5app.chain

interface HandlerChain {
    fun addHeader(inputHeader: String): String
}
