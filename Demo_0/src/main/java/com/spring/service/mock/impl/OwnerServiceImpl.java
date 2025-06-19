package com.spring.service.mock.impl;

import com.spring.service.OwnerService;

public class OwnerServiceImpl implements OwnerService {
	private int ownerId;

	public OwnerServiceImpl(int ownerId) {
		this.ownerId = ownerId;
		System.out.println("OwnerServiceImpl mock	bean	created");
	}

	@Override
	public String findOwner() {
		return String.format("Owner found with the ownerId %s", ownerId);
	}
}
