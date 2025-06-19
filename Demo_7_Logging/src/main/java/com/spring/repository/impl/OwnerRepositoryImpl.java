package com.spring.repository.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.exceptions.OwnerNotFoundException;
import com.spring.repository.OwnerRepository;

@Component
@Scope("prototype")
public class OwnerRepositoryImpl implements OwnerRepository{

	public OwnerRepositoryImpl() {
		System.out.println("Repository layer bean created....");
	}

	@Override
	public String findOwner(int ownerId) throws OwnerNotFoundException{
		if(ownerId % 2 == 0) {
			return "Owner found with the ownerId: "+ ownerId;
		}else {
			throw new OwnerNotFoundException("Owner Not Found with the Id: "+ownerId);
		}
	}

}
