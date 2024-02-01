package dev.da0hn.course.micronaut.controller.dtos

import io.micronaut.serde.annotation.Serdeable


@Serdeable
data class CreateVehicleDto(
  val model: String,
  val brand: String,
  val year: Int,
)
