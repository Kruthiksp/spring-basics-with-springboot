package com.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.spring.repository.OwnerRepository;
import com.spring.service.OwnerService;

@Component("commonService")
public class OwnerServiceImpl_Common implements OwnerService {

	@Autowired
	private OwnerRepository ownerRepository;
	@Value("10")
	private int ownerId;

	public OwnerServiceImpl_Common() {
		System.out.println("common Service...");	
	}

	@Override
	public String findOwner() {
		return ownerRepository.findOwner(ownerId);
	}
}
