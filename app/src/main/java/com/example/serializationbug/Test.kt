@file:UseSerializers(LocalDateSerializer::class)

package com.example.serializationbug

import com.example.mylibrary.LocalDateSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.threeten.bp.LocalDate

@Serializable
data class Test(
  val date: LocalDate
)
