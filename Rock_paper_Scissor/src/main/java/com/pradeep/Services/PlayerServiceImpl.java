package com.pradeep.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Service;

import com.pradeep.Exception.playerException;
import com.pradeep.Model.Player;
import com.pradeep.Repository.PlayerRepository;


@Service
public class PlayerServiceImpl implements PlayerService{
	
	
	@Autowired
	private PlayerRepository playerRepository;
	

	@Override
	public Player registerUser(Player player) throws playerException {
		Optional<Player> opt = playerRepository.findByEmail(player.getEmail());
		if(opt.isEmpty()) {
			return playerRepository.save(player);
		}else {
			throw new playerException("User already exist with the email :"+player.getEmail());
		}
	}

	@Override
	public Player login(String email) throws playerException {
		
		Optional<Player> opt = playerRepository.findByEmail(email);
		 if(opt.isPresent()){
	        return opt.get();
	     }else{
	        throw new playerException("Student does not exist..");
	     }
		
		
	}

	@Override
	public String findWinnerHandler(String rockPaperScissor) throws playerException {
		String [] computerGeneratedValue = {"Rock" , "Paper" , "Scissor" };
		int index = (int) (Math.random() * computerGeneratedValue.length);
		String computerSign = computerGeneratedValue[index];
		
		if(rockPaperScissor.equals(computerSign)) {
			return "It is a tie";
		}else if(rockPaperScissor.equals("Rock") && computerSign.equals("Scissor")) {
			return "Player wins";
		}else if(rockPaperScissor.equals("Scissor") && computerSign.equals("Rock")) {
			return "Computer wins";
		}else if(rockPaperScissor.equals("Scissor") && computerSign.equals("Paper")) {
			return "Player wins";
		}else if(rockPaperScissor.equals("Paper") && computerSign.equals("Scissor")) {
			return "Computer wins";
		}else if(rockPaperScissor.equals("Paper") && computerSign.equals("Rock")) {
			return "Player wins";
		}else if(rockPaperScissor.equals("Rock") && computerSign.equals("Paper")) {
			return "Computer wins";
		}else {
			throw new playerException("You enter wrong sign....");
		}
	}

}
