package com.spring.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.exceptions.OwnerNotFoundException;
import com.spring.repository.OwnerRepository;

@Component
@Scope("prototype")
@Profile("local")
public class OwnerRepositoryImpl implements OwnerRepository{

	@Autowired	
	public OwnerRepositoryImpl() {
		System.out.println("Repository layer bean created....");
	}

	@Override
	public String findOwner(int ownerId) throws OwnerNotFoundException{
		if(ownerId % 2 == 0) {
			return "Owner found with the ID: "+ ownerId;
		}else {
			throw new OwnerNotFoundException("Failed to find the owner with Owner ID: "+ownerId);
		}
	}

}
