package com.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.spring.repository.OwnerRepository;
import com.spring.service.OwnerService;

@Component
public class OwnerServiceImpl__Construction_AW implements OwnerService {

	private OwnerRepository ownerRepository;
	private int ownerId;
	
	@Autowired
	public OwnerServiceImpl__Construction_AW(OwnerRepository ownerRepository, @Value("10") int ownerId) {
		super();
		this.ownerRepository = ownerRepository;
		this.ownerId = ownerId;
		System.out.println("Constructor based Autowiring...");
	}

	@Override
	public String findOwner() {
		return ownerRepository.findOwner(ownerId);
	}
}
