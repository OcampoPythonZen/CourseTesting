package com.example.junit5app.example.models

import java.time.LocalDate
import java.time.LocalDateTime.now
import org.json.JSONObject
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class UtilTest {

    @BeforeAll
    fun setUp() {
        println("Setting up...")
    }

    @Test
    @DisplayName("Asserting the toObject function passing a list with Jackson Object Mapper")
    @Disabled
    fun toObject() {
        val response = """
            [
                {
                "key": "value",
                "key2": "value2"
                },
                {
                "key": "value",
                "key2": "value2"
                }
            ]
        """.trimIndent()
        println(response)
    }

    @Test
    @DisplayName("Asserting the toObject function passing a class with Jackson Object Mapper")
    fun testToObject() {
        val response = """
            {
            "key": "value",
            "key2": "value2"
            }
        """.trimIndent()
        val onJson = response.toObject(JSONObject::class.java)
        Assertions.assertNotNull(onJson)
    }

    @Test
    @DisplayName("Asserting the dateCreate function passing 10 months additional")
    fun dateCreate() {
        val plusMonthsValue = 10L
        val dateCreated = dateCreate(null, plusMonthsValue)
        val newDate = dateCreated.substringBeforeLast("T")
        Assertions.assertNotNull(dateCreated)
        Assertions.assertEquals(newDate, now().plusMonths(plusMonthsValue).toString().substringBeforeLast("T"))
    }

    @Test
    @DisplayName("Asserting the dateFormat function passing a date and validate the information")
    fun dateFormat() {
        val utilFormat = dateFormat(now().toString())
        val newDate = utilFormat.toInstant().toString().substringBeforeLast("T")
        val now = LocalDate.now()
        Assertions.assertNotNull(utilFormat)
        Assertions.assertEquals(newDate, now.toString())
    }
}