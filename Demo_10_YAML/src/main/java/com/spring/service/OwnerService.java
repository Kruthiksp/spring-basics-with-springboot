package com.spring.service;

import com.exceptions.OwnerNotFoundException;

public interface OwnerService {
	String findOwner() throws OwnerNotFoundException;
	void modifyOwnerId(int newOwnerId);
}
