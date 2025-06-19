package com.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.spring.repository.OwnerRepository;
import com.spring.service.OwnerService;

@Component("specialService")
public class OwnerServiceImpl_Special implements OwnerService {

	@Autowired
	@Qualifier("specialRepository")
	private OwnerRepository ownerRepository;
	@Value("10")
	private int ownerId;

	public OwnerServiceImpl_Special() {
		System.out.println("special Service...");	
	}

	@Override
	public String findOwner() {
		return ownerRepository.findOwner(ownerId);
	}
}
