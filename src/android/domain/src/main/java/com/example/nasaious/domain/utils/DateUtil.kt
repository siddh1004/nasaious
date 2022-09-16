package com.example.nasaious.domain.utils

import com.example.nasaious.domain.exception.InvalidDateFormatException
import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun getDate(date: String): LocalDate? {
    return try {
        LocalDate.parse(date, DateTimeFormatter.ISO_DATE)
    } catch (ex: Exception) {
        throw InvalidDateFormatException()
    }
}
