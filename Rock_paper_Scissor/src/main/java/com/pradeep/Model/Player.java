package com.pradeep.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Player {
	
	//player details...
	
	@Id
	@Email(message = "email should be in proper format")
	private String email;
	
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	
	
	private String userName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
    
}
