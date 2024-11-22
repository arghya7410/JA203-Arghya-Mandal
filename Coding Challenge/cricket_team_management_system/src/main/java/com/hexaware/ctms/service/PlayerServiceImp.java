package com.hexaware.ctms.service;
/*@Author: Arghya Mandal
* Date: 2024-11-22
*/
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.ctms.dto.PlayersDto;
import com.hexaware.ctms.entity.Players;
import com.hexaware.ctms.exception.PlayerNotFoundException;
import com.hexaware.ctms.repository.IPlayersRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class PlayerServiceImp implements IPlayerService {
	@Autowired
    private IPlayersRepository playersRepository;
	@Override
	public Players addPlayer(PlayersDto playerDto) {
		Players player = new Players();
        player.setPlayerName(playerDto.getPlayerName());
        player.setJerseyNumber(playerDto.getJerseyNumber());
        player.setRole(playerDto.getRole());
        player.setTotalMatches(playerDto.getTotalMatches());
        player.setTeamName(playerDto.getTeamName());
        player.setCountryName(playerDto.getCountryName());
        player.setDescription(playerDto.getDescription());
        return playersRepository.save(player);
	}

	@Override
	public Players updatePlayer(PlayersDto playerDto) {
		Players existingPlayer = playersRepository.findById(playerDto.getPlayerId())
                .orElseThrow(() -> new PlayerNotFoundException("Player with ID " + playerDto.getPlayerId() + " not found."));
        existingPlayer.setPlayerName(playerDto.getPlayerName());
        existingPlayer.setJerseyNumber(playerDto.getJerseyNumber());
        existingPlayer.setRole(playerDto.getRole());
        existingPlayer.setTotalMatches(playerDto.getTotalMatches());
        existingPlayer.setTeamName(playerDto.getTeamName());
        existingPlayer.setCountryName(playerDto.getCountryName());
        existingPlayer.setDescription(playerDto.getDescription());
        return playersRepository.save(existingPlayer);
	}

	@Override
	public Players getPlayerById(int playerId) {
		return playersRepository.findById(playerId)
                .orElseThrow(() -> new PlayerNotFoundException("Player with ID " + playerId + " not found."));
	}

	@Override
	public List<Players> getAllPlayers() {
		return playersRepository.findAll();
	}

	@Override
	public void deletePlayerById(int playerId) {
		Players player = playersRepository.findById(playerId)
                .orElseThrow(() -> new PlayerNotFoundException("Player with ID " + playerId + " not found."));
        playersRepository.delete(player);

	}

}
