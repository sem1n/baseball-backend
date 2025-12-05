package kr.ac.kumoh.s20240624.baseball_backend.service

import kr.ac.kumoh.s20240624.baseball_backend.model.Player
import kr.ac.kumoh.s20240624.baseball_backend.repository.PlayerRepository
import org.springframework.stereotype.Service

@Service
class PlayerService(
    private val repository: PlayerRepository
) {
    fun getAllPlayers(): List<Player> = repository.findAll()
    fun getPlayerById(id: String): Player? = repository.findById(id).orElse(null)
}