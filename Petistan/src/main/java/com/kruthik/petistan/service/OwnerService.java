package com.kruthik.petistan.service;

import java.util.List;
import java.util.Optional;

import com.kruthik.petistan.dto.OwnerDTO;
import com.kruthik.petistan.exceptions.DuplicateOwnerIdException;
import com.kruthik.petistan.exceptions.OwnerNotFoundException;

public interface OwnerService {
	void saveOwner(OwnerDTO owner) throws DuplicateOwnerIdException;

	OwnerDTO findOwnerById(int ownerId) throws OwnerNotFoundException;

	void updateOwner(int ownerId, String petNewName) throws OwnerNotFoundException;

	void deleteOwner(int ownerId) throws OwnerNotFoundException;

	List<OwnerDTO> findAllOwners();
}
