package com.example.junit5app.example.models

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class AccountTest {

    private val account = Account()

    @BeforeEach
    fun setUp() {
        account.apply {
            person = "Andres"
            amount = 2000F
        }
    }

    @Test
    fun `Asserting data class Account`() {
        Assertions.assertNotNull(account)
        Assertions.assertEquals("Andres", account.person)
        Assertions.assertEquals(2000.0F, account.amount)
        Assertions.assertTrue(account.person == "Andres")
    }

    @Test
    fun `Asserting athe class of the Amount on Account`() {
        Assertions.assertTrue(account.amount is Float)
    }

    @Test
    fun `Comparing To the amount of Account`() {
        Assertions.assertFalse(account.amount?.compareTo(2000.0F) != 0)
    }


}
