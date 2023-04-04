package com.pradeep.Model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Data
public class Address {
	
	private Integer addressId;

	private String city;
	
	private String state;
	
	private String pincode;
	
	
}
