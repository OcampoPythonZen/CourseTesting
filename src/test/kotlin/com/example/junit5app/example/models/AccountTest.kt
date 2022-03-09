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
    fun `Asserting amounts account`() {
        Assertions.assertEquals(2000.0F, account.amount)
    }

    @Test
    fun `Asserting athe class of the Amount on Account`() {
        Assertions.assertTrue(account.amount is Float)
    }

    @Test
    fun `Comparing To the amount of Account`() {
        Assertions.assertFalse(account.amount?.compareTo(2000.0F) != 0)
    }

    @Test
    fun `Asserting and comparing the reference between two instances of Account`() {
        val accountOne = Account("Edgar", 434.99F)
        val accountTwo = Account("Edgar", 434.99F)
        println("Name: ${accountOne.person}, Amount: ${accountOne.amount}, Hash: ${accountOne.hashCode()}")
        println("Name: ${accountTwo.person}, Amount: ${accountTwo.amount}, Hash: ${accountTwo.hashCode()}")
        Assertions.assertNotEquals(accountOne, accountTwo)
    }

    @Test
    fun `Account test with debit method`() {
        val account = Account("Jhon", 3.1416F)
        account.debit(0.1416F)
        Assertions.assertEquals(3.0F, account.amount)
    }

    @Test
    fun `Account test with credit method`() {
        val account = Account("Edd", 1.99F)
        account.credit(0.99F)
        Assertions.assertEquals(1.0F, account.amount)
    }

    @Test
    fun `Validating the hashCode method of Account Class`() {
        val hash = account.hashCode()
        println(hash)
        Assertions.assertNotNull(hash)
    }

    @Test
    fun `Validating the truncated String for 40 len`() {
        val moreThan40 = "This is a String, it has a length more than 40 characters."
        val smallerThan40 = "This is a small"
        val success: String = moreThan40.truncate()
        val notSuccess: String = smallerThan40.truncate()
        Assertions.assertEquals(success.length, 40)
        Assertions.assertNotEquals(notSuccess.length, 40)
    }
}
