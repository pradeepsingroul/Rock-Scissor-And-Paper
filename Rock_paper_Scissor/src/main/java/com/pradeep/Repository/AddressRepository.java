package com.pradeep.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pradeep.Model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

	//address repository
	
}
