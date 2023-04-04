package com.pradeep.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pradeep.Model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String>{

}
