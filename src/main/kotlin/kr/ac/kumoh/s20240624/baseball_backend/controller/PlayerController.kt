package kr.ac.kumoh.s20240624.baseball_backend.controller

import kr.ac.kumoh.s20240624.baseball_backend.model.Player
import kr.ac.kumoh.s20240624.baseball_backend.service.PlayerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/players")
class PlayerController(
    private val service: PlayerService
) {
    @GetMapping
    fun getAllPlayers(): List<Player> = service.getAllPlayers()

    @GetMapping("/{id}")
    fun getPlayerById(@PathVariable id: String): Player? = service.getPlayerById(id)
}