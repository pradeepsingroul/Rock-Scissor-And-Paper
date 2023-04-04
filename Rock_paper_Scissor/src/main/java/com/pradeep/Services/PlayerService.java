package com.pradeep.Services;

import com.pradeep.Exception.playerException;
import com.pradeep.Model.Player;

public interface PlayerService {

	
	public Player registerUser(Player player) throws playerException;
		
	public Player login(String email) throws playerException;
	
	public String findWinnerHandler(String rockPaperScissor) throws playerException;
	
	
}
