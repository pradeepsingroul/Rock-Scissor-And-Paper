package com.pradeep.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradeep.Model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
