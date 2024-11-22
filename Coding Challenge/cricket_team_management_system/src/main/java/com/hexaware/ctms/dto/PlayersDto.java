package com.hexaware.ctms.dto;
/*@Author: Arghya Mandal
* Date: 2024-11-22
*/
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PlayersDto {
	// dto class for data transfer between different layers
	private int playerId;
	private String playerName;
	private int jerseyNumber;
	private String role;
	private int totalMatches;
	private String teamName;
	private String countryName;
	private String description;
}
