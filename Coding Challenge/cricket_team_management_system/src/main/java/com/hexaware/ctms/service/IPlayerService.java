package com.hexaware.ctms.service;
/*@Author: Arghya Mandal
* Date: 2024-11-22
*/
import java.util.List;

import com.hexaware.ctms.dto.PlayersDto;
import com.hexaware.ctms.entity.Players;

public interface IPlayerService {
	public Players addPlayer(PlayersDto playerDto);
	public Players updatePlayer(PlayersDto playerDto);
	public Players getPlayerById(int playerId);
	public List<Players> getAllPlayers();
	public void deletePlayerById(int playerId);
}
