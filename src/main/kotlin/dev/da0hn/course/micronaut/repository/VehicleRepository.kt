package dev.da0hn.course.micronaut.repository

import dev.da0hn.course.micronaut.model.Vehicle
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface VehicleRepository : JpaRepository<Vehicle, Long>
