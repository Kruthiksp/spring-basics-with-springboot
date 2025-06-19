package com.spring.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.exceptions.OwnerNotFoundException;
import com.spring.repository.OwnerRepository;

@Component
@Scope("prototype")
public class OwnerRepositoryImpl implements OwnerRepository{

	@Autowired
	private Environment environment;
	
	public OwnerRepositoryImpl() {
		System.out.println("Repository layer bean created....");
	}

	@Override
	public String findOwner(int ownerId) throws OwnerNotFoundException{
		if(ownerId % 2 == 0) {
			return environment.getProperty("owner.found")+ ownerId;
		}else {
			throw new OwnerNotFoundException(environment.getProperty("owner.notFound")+ownerId);
		}
	}

}
