package com.hexaware.ctms.entity;

import jakarta.persistence.Column;
/*@Author: Arghya Mandal
* Date: 2024-11-22
*/
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Players {
	//Entity class to store all attributes of players
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int playerId;
	@NotNull(message = "Player name can't be null")
    @Size(min = 5, message = "Player name must be at least 5 characters long")
	private String playerName;
	@NotNull(message = "Jersey number can't be null")
	@Column(unique = true)
	private int jerseyNumber;
	@NotNull(message = "Role can't be null")
	private String role;
	@Min(0)
	private int totalMatches;
	@NotNull(message = "Team's name can't be null")
    @Size(min = 5, message = "Team's name must be at least 5 characters long")
	private String teamName;
	@NotNull(message = "Country's name can't be null")
    @Size(min = 5, message = "Country's name must be at least 5 characters long")
	private String countryName;
	@Size(max = 1000, message = "Description must be less than or equal to 1000 characters")
	private String description;
}
