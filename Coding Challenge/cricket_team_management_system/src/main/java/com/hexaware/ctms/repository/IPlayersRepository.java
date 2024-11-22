package com.hexaware.ctms.repository;
/*@Author: Arghya Mandal
* Date: 2024-11-22
*/
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.ctms.dto.PlayersDto;
import com.hexaware.ctms.entity.Players;
@Repository
public interface IPlayersRepository extends JpaRepository<Players, Integer>{
	
}
