package com.example.junit5app.example.models

import com.example.junit5app.exceptions.InsufficientCashException

@Suppress("UNUSED_EXPRESSION")
data class Account(
    var person: String? = null,
    var amount: Float? = null
) {
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    fun debit(amountMinus: Float) {
        val newAmount = this.amount?.minus(amountMinus)
        if (newAmount == null || newAmount < 0) throw InsufficientCashException(message = "Insufficient Cash to do the operation.") else newAmount
    }

    fun credit(amountMinus: Float) {
        val newAmount = this.amount?.minus(amountMinus)
        if (newAmount == null || newAmount < 0) throw InsufficientCashException(message = "Insufficient Cash to do the operation.") else newAmount
    }

    override fun hashCode(): Int {
        var result = person?.hashCode() ?: 0
        result = 31 * result + (amount?.hashCode() ?: 0)
        return result
    }
}
