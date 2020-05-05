package com.example.serializationbug

import kotlinx.serialization.Decoder
import kotlinx.serialization.Encoder
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialDescriptor
import kotlinx.serialization.Serializable
import java.util.*

@Serializable
data class TypeChecking(
  @Serializable(with = CustomIntSerializer::class)
  val date: Date
)

class CustomIntSerializer : KSerializer<Int> {

  override val descriptor: SerialDescriptor
    get() = TODO("Not yet implemented")

  override fun deserialize(decoder: Decoder): Int {
    TODO("Not yet implemented")
  }

  override fun serialize(encoder: Encoder, value: Int) {
    TODO("Not yet implemented")
  }
}
