package com.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.spring.repository.OwnerRepository;
import com.spring.service.OwnerService;

@Component
public class OwnerServiceImpl__Property_AW implements OwnerService {

	@Autowired
	private OwnerRepository ownerRepository;
	@Value("10")
	private int ownerId;

	public OwnerServiceImpl__Property_AW() {
		System.out.println("Property Based Autowiring...");	
	}

	@Override
	public String findOwner() {
		return ownerRepository.findOwner(ownerId);
	}
}
