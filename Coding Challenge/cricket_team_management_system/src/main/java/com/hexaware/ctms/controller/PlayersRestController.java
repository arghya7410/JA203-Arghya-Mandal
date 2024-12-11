package com.hexaware.ctms.controller;
/*@Author: Arghya Mandal
* Date: 2024-11-22
*/
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.ctms.dto.PlayersDto;
import com.hexaware.ctms.entity.Players;
import com.hexaware.ctms.service.IPlayerService;

import jakarta.validation.Valid;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/players")
public class PlayersRestController {
	@Autowired
    private IPlayerService playerService;
	@PostMapping("/add")
    public Players addPlayer(@Valid @RequestBody PlayersDto playerDto) {
        return playerService.addPlayer(playerDto);
    }
	@PutMapping("/update/{playerId}")
    public Players updatePlayer(@PathVariable int playerId, @Valid @RequestBody PlayersDto playerDto) {
		playerDto.setPlayerId(playerId);
		return playerService.updatePlayer(playerDto);
    }
	@GetMapping("/getbyid/{playerId}")
	public Players getPlayerById(@PathVariable int playerId) {
		return playerService.getPlayerById(playerId);
	}
	
	@GetMapping("/getall")
    public List<Players> getAllPlayers() {
        return playerService.getAllPlayers();
    }
	
	@DeleteMapping("/delete/{playerId}")
    public void deletePlayerById(@PathVariable int playerId) {
        playerService.deletePlayerById(playerId);
    }
}
