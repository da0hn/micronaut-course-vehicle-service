package dev.da0hn.course.micronaut.service

import dev.da0hn.course.micronaut.model.Vehicle
import dev.da0hn.course.micronaut.repository.VehicleRepository
import jakarta.inject.Singleton

@Singleton
class VehicleService(private val vehicleRepository: VehicleRepository) {

  fun create(vehicle: Vehicle): Vehicle {
    return vehicleRepository.save(vehicle)
  }

  fun findById(id: Long): Vehicle {
    return vehicleRepository.findById(id)
      .orElseThrow { throw IllegalArgumentException("Vehicle not found") }
  }

}
