package com.spring.repository;

import com.exceptions.OwnerNotFoundException;

public interface OwnerRepository {
	String findOwner(int ownerId) throws OwnerNotFoundException;
}
