package com.spring.repository.impl;

import org.springframework.stereotype.Component;

import com.spring.repository.OwnerRepository;

@Component("specialRepository")
public class OwnerRepositoryImpl_special implements OwnerRepository{

	public OwnerRepositoryImpl_special() {
		System.out.println("special Repository...");
	}

	@Override
	public String findOwner(int ownerId) {
		return "Owner found with the id: "+ownerId+" in special repository";
	}

}
