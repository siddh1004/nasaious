// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN", "IMPLICIT_NOTHING_TYPE_ARGUMENT_IN_RETURN_POSITION")

package com.example.nasaious.`data`.remote.response

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import java.lang.NullPointerException
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.emptySet
import kotlin.text.buildString

public class ErrorResponseJsonAdapter(
  moshi: Moshi
) : JsonAdapter<ErrorResponse>() {
  private val options: JsonReader.Options = JsonReader.Options.of("error", "message")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "error")

  public override fun toString(): String = buildString(35) {
      append("GeneratedJsonAdapter(").append("ErrorResponse").append(')') }

  public override fun fromJson(reader: JsonReader): ErrorResponse {
    var error: String? = null
    var message: String? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> error = nullableStringAdapter.fromJson(reader)
        1 -> message = nullableStringAdapter.fromJson(reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return ErrorResponse(
        error = error,
        message = message
    )
  }

  public override fun toJson(writer: JsonWriter, value_: ErrorResponse?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("error")
    nullableStringAdapter.toJson(writer, value_.error)
    writer.name("message")
    nullableStringAdapter.toJson(writer, value_.message)
    writer.endObject()
  }
}