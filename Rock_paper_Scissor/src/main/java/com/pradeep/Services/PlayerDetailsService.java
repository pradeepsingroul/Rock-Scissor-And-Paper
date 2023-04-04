package com.pradeep.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.pradeep.Model.Player;
import com.pradeep.Repository.PlayerRepository;


@Service
public class PlayerDetailsService implements UserDetailsService{
	
	
	
	@Autowired
    private PlayerRepository playerRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Player> optionalPlayer = playerRepository.findByEmail(username);
        if (optionalPlayer.isPresent()){
            Player player = optionalPlayer.get();
            List<GrantedAuthority> authorities = new ArrayList<>();
    

            return new User(player.getEmail(),player.getPassword(),authorities);
            
        }else throw new BadCredentialsException("User details not found with this userName :"+username);
    }

}
