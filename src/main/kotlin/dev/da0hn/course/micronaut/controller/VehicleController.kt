package dev.da0hn.course.micronaut.controller

import dev.da0hn.course.micronaut.controller.dtos.CreateVehicleDto
import dev.da0hn.course.micronaut.controller.dtos.VehicleDto
import dev.da0hn.course.micronaut.model.Vehicle
import dev.da0hn.course.micronaut.service.VehicleService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

@Controller("/vehicles")
class VehicleController(private val vehicleService: VehicleService) {

  @Post
  fun create(@Body createVehicle: CreateVehicleDto): HttpResponse<VehicleDto> {
    val vehicle = Vehicle(
      model = createVehicle.model,
      brand = createVehicle.brand,
      year = createVehicle.year
    )
    val vehicleCreated = vehicleService.create(vehicle)
    return HttpResponse.created(VehicleDto(vehicleCreated))
  }

  @Get("/{id}")
  fun findById(id: Long): HttpResponse<VehicleDto> {
    return VehicleDto(vehicleService.findById(id)).let { HttpResponse.ok(it) }
  }

}
