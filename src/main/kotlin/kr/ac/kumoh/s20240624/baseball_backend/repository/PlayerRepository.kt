package kr.ac.kumoh.s20240624.baseball_backend.repository

import kr.ac.kumoh.s20240624.baseball_backend.model.Player
import org.springframework.data.mongodb.repository.MongoRepository

interface PlayerRepository : MongoRepository<Player, String> {
    fun findByName(name: String): List<Player>
}