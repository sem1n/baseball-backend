package kr.ac.kumoh.s20240624.baseball_backend.model

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.Transient
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "players")
data class Player(
    @Id val id: String? = null,
    val team: String,
    val name: String,
    val number: Int,
    val position: String,
    val birth: String,
    val physical: String,
) {
    @get:Transient
    val imagePath: String
        get() = "/images/$number.png"
}
