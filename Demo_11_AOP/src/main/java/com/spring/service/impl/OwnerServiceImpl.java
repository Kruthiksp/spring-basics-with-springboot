package com.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.exceptions.OwnerNotFoundException;
import com.spring.repository.OwnerRepository;
import com.spring.service.OwnerService;

@Scope("prototype")
@Service
public class OwnerServiceImpl implements OwnerService {

	@Autowired
	private OwnerRepository ownerRepository;
	@Value("10")
	private int ownerId;

	public OwnerServiceImpl() {
		System.out.println("Service layer Bean created...");	
	}

	@Override
	public String findOwner() throws OwnerNotFoundException {
		return ownerRepository.findOwner(ownerId);
	}

	@Override
	public void modifyOwnerId(int newOwnerId) {
		this.ownerId = newOwnerId;
	}
}
