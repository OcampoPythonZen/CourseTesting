package com.example.junit5app.util

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

fun Any?.toJsonString(): String = jacksonObjectMapper().writeValueAsString(this)
