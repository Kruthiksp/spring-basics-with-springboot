package com.spring.repository.impl;

import com.spring.repository.OwnerRepository;

public class OwnerRepositoryImpl implements OwnerRepository{

	public OwnerRepositoryImpl() {
		System.out.println("OwnerRepositoryImpl bean created....");
	}

	@Override
	public String findOwner(int ownerId) {
		return String.format("Owner found with the ownerId %s", ownerId);
	}

}
