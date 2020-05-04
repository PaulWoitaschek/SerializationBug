package com.example.mylibrary

import kotlinx.serialization.Decoder
import kotlinx.serialization.Encoder
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialDescriptor
import org.threeten.bp.LocalDate

class LocalDateSerializer : KSerializer<LocalDate> {
  override val descriptor: SerialDescriptor
    get() = TODO("Not yet implemented")

  override fun deserialize(decoder: Decoder): LocalDate {
    TODO("Not yet implemented")
  }

  override fun serialize(encoder: Encoder, value: LocalDate) {
    TODO("Not yet implemented")
  }
}