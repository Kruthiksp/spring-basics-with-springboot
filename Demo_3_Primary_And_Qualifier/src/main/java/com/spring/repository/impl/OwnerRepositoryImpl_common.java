package com.spring.repository.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.spring.repository.OwnerRepository;

@Primary
@Component("commonRepository")
public class OwnerRepositoryImpl_common implements OwnerRepository{

	public OwnerRepositoryImpl_common() {
		System.out.println("common Repository...");
	}

	@Override
	public String findOwner(int ownerId) {
		return "Owner found with the id: "+ownerId+" in common repository";
	}

}
