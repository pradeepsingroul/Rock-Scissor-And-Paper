package com.pradeep.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pradeep.Model.Player;
import com.pradeep.Services.PlayerService;

@RestController
public class PlayerController {
	
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private PlayerService playerService;

	
	@PostMapping("/users")
    public ResponseEntity<Player> registerPlayerHandler(@RequestBody Player player){
		player.setPassword(passwordEncoder.encode(player.getPassword()));
        Player player1 = playerService.registerUser(player);
        return new ResponseEntity<>(player1, HttpStatus.CREATED);

    }
	@GetMapping("/users")
    public ResponseEntity<String> findWinner(@RequestParam("RcokPapperScissor") String RcokPapperScissor){
		
		String winner = playerService.findWinnerHandler(RcokPapperScissor);
		return new ResponseEntity<String>(winner,HttpStatus.OK);
		

    }
	
	
	
	
}
