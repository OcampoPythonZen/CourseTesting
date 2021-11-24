package com.example.junit5app.example.models

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import java.time.Clock
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZoneOffset
import java.util.Date
import org.json.JSONObject
import org.json.XML

fun Any.toJsonString(): String {
    return jacksonObjectMapper().writeValueAsString(this)
}

fun <C> String.toObject(list: TypeReference<C>): C {
    return jacksonObjectMapper().readValue(this, list)
}

fun <C> Any.toObject(clazz: Class<C>): C {
    val string = this.toJsonString()
    return jacksonObjectMapper().readValue(string, clazz)
}

fun dateCreate(days: Long?, months: Long): String {
    val nowUTC = LocalDateTime.now(Clock.systemUTC())
    return days?.let { nowUTC.plusDays(it).toInstant(ZoneOffset.UTC).toString().replace("Z", "") }
        ?: nowUTC.plusMonths(months).toInstant(ZoneOffset.UTC).toString().replace("Z", "")
}

fun dateFormat(date: String): Date {
    val dateTime = LocalDateTime.parse(date)
    return Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant())
}

fun String?.xmlToJson(): JSONObject = XML.toJSONObject(this)


