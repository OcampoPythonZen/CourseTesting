package com.example.junit5app.example.models

class Bank(bankName: String) {

    fun transfer(origin: Account, destiny: Account, amount: Float): Pair<Float, Float> {
        val newAmountOnOrigin = origin.debit(amount)
        val newAmountOnDestiny = destiny.credit(amount)
        return Pair(newAmountOnOrigin, newAmountOnDestiny)
    }
}