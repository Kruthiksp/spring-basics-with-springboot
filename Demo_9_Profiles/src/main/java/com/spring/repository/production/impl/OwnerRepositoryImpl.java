package com.spring.repository.production.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.exceptions.OwnerNotFoundException;
import com.spring.repository.OwnerRepository;

@Component("productionBean")
@Scope("prototype")
@Profile("production")
public class OwnerRepositoryImpl implements OwnerRepository{

	@Autowired	
	public OwnerRepositoryImpl() {
		System.out.println("Production bean.....");
	}

	@Override
	public String findOwner(int ownerId) throws OwnerNotFoundException{
			return "Owner found with the ID: "+ ownerId;
	}

}
