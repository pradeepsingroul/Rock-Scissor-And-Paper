package com.pradeep.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Data
public class Address {
	
	//player address
	
	@Id
	private Integer addressId;

	private String city;
	
	private String state;
	
	private String pincode;
	
	
}
