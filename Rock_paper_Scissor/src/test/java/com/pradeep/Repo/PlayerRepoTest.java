package com.pradeep.Repo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pradeep.Model.Player;
import com.pradeep.Repository.PlayerRepository;

@SpringBootTest
public class PlayerRepoTest {
	
	@Autowired
	 private PlayerRepository playerRepository;

	
	@Test
	void isPersonExitByEmail() {
		Optional<Player> optional = playerRepository.findByEmail("Pradeep@gmail.com");
		System.out.println(optional.get());
		String nameString = optional.get().getUserName();
		assertThat(nameString).isEqualTo("pradeep singroul");
		
	
	
	}
	
}
