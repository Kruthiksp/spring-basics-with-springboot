package com.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.spring.repository.OwnerRepository;
import com.spring.service.OwnerService;

@Scope("prototype")
@Component
public class OwnerServiceImpl implements OwnerService {

	@Autowired
	private OwnerRepository ownerRepository;
	@Value("10")
	private int ownerId;

	public OwnerServiceImpl() {
		System.out.println("Service layer Bean created...");	
	}

	@Override
	public String findOwner() {
		return ownerRepository.findOwner(ownerId);
	}

	@Override
	public void modifyOwnerId(int newOwnerId) {
//		System.out.println("Modified owner id is: "+newOwnerId);
		this.ownerId = newOwnerId;
	}
}
