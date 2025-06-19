package com.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.spring.repository.OwnerRepository;
import com.spring.service.OwnerService;

@Component
public class OwnerServiceImpl__Setter_AW implements OwnerService {

	private OwnerRepository ownerRepository;
	private int ownerId;

	public OwnerServiceImpl__Setter_AW() {
		System.out.println("Setter Based Autowiring...");	
	}

	@Autowired
	public void setOwnerRepository(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}

	@Value("10")
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	@Override
	public String findOwner() {
		return ownerRepository.findOwner(ownerId);
	}
}
