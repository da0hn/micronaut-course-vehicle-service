package dev.da0hn.course.micronaut.controller.dtos

import dev.da0hn.course.micronaut.model.Vehicle
import io.micronaut.serde.annotation.Serdeable

@Serdeable
data class VehicleDto(
  val id: Long,
  val model: String,
  val brand: String,
  val year: Int
) {
  constructor(vehicle: Vehicle) : this(vehicle.id!!, vehicle.model, vehicle.brand, vehicle.year)
}
