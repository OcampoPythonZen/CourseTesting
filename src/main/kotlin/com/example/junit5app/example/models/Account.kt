package com.example.junit5app.example.models

data class Account(
    var person: String? = null,
    var amount: Float? = null
) {
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    fun debit(amountMinus: Float) {
        this.amount = this.amount?.minus(amountMinus)
    }

    fun credit(amountMinus: Float) {
        this.amount = this.amount?.minus(amountMinus)
    }

    override fun hashCode(): Int {
        var result = person?.hashCode() ?: 0
        result = 31 * result + (amount?.hashCode() ?: 0)
        return result
    }
}
