package dev.da0hn.course.micronaut.model


import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.io.Serializable

@Entity(name = "vehicle")
data class Vehicle(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Long? = null,
  val model: String,
  val brand: String,
  val year: Int,
) : Serializable {


  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (other !is Vehicle) return false

    if (id != other.id) return false
    return true
  }

  override fun hashCode(): Int {
    return id?.hashCode() ?: 0
  }

  override fun toString(): String {
    return "Vehicle(id=$id, model='$model', brand='$brand', year=$year)"
  }


}
