package com.pradeep.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pradeep.Model.Player;
import com.pradeep.Services.PlayerService;

@RestController
public class LoginController {
	
	@Autowired
	private PlayerService playerService;

	
	// login method it will take authenctication object and return user details if it exist
	@GetMapping("/users/login")
	private ResponseEntity<Player> getLoggenInPlayerDetailHandler(Authentication auth){
		Player player = playerService.login(auth.getName());
		return new ResponseEntity<>(player,HttpStatus.ACCEPTED);
	}
	
	
}
