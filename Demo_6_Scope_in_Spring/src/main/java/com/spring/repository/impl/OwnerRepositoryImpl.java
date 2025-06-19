package com.spring.repository.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.spring.repository.OwnerRepository;

@Component
@Scope("prototype")
public class OwnerRepositoryImpl implements OwnerRepository{

	public OwnerRepositoryImpl() {
		System.out.println("OwnerRepositoryImpl bean created....");
	}

	@Override
	public String findOwner(int ownerId) {
		return String.format("Owner found with the ownerId: %s", ownerId);
	}

}
