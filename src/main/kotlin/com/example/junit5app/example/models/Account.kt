package com.example.junit5app.example.models

data class Account(
    var person: String? = null,
    var amount: Float? = null
) {
    fun debit(amount: Float): Float? {
        return this.amount?.minus(amount)
    }

    fun credit(amount: Float): Float? {
        return this.amount?.minus(amount)
    }
}
