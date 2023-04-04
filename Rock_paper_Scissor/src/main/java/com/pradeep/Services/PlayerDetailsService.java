package com.pradeep.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.pradeep.Model.Player;
import com.pradeep.Repository.PlayerRepository;


@Service
public class PlayerDetailsService implements UserDetailsService{
	
	
	@Autowired
    private PlayerRepository playerRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Player> optionalStudent = user.findByEmail(username);
        if (optionalStudent.isPresent()){
            Student s1 = optionalStudent.get();
            List<GrantedAuthority> authorities = new ArrayList<>();

            return new Player(s1.getEmail(),s1.getPassword(),authorities);
        }else throw new BadCredentialsException("User details not found with this userName :"+username);
    }

}
