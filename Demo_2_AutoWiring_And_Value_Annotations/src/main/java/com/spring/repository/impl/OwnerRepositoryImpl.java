package com.spring.repository.impl;

import org.springframework.stereotype.Component;

import com.spring.repository.OwnerRepository;

@Component
public class OwnerRepositoryImpl implements OwnerRepository{

	public OwnerRepositoryImpl() {
		System.out.println("OwnerRepositoryImpl bean created....");
	}

	@Override
	public String findOwner(int ownerId) {
		return String.format("\nOwner found with the ownerId: %s", ownerId);
	}

}
