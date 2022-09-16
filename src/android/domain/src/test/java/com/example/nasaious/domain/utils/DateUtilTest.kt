package com.example.nasaious.domain.utils

import com.example.nasaious.domain.exception.InvalidDateFormatException
import org.junit.Assert.*
import org.junit.Test
import java.time.LocalDate

class DateUtilTest {

    @Test
    fun getDate_ValidFormat_returnsOk() {
        val dateInString = "2019-12-01"
        val expectedDate = LocalDate.of(2019, 12, 1)

        val actualDate = getDate(dateInString)

        assertEquals(expectedDate, actualDate)
    }

    @Test(expected = InvalidDateFormatException::class)
    fun getDate_InValidFormat_returnsError() {
        val dateInString = "20I9-I2-01"
        getDate(dateInString)
    }
}