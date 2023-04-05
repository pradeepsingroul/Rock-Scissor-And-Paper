package com.pradeep.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pradeep.Exception.playerException;
import com.pradeep.Model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String>{
	
	//player repo
	
	public Optional<Player> findByEmail(String email) throws playerException;

}
