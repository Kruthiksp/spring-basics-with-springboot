package com.kruthik.petistan.repositories.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.kruthik.petistan.dto.OwnerDTO;
import com.kruthik.petistan.repositories.OwnerRepository;

import jakarta.annotation.PostConstruct;

@Repository
public class OwnerRepositoryImpl implements OwnerRepository {

	private List<OwnerDTO> ownerList;

	public OwnerRepositoryImpl() {
		this.ownerList = new ArrayList<>();
	}
	
	@PostConstruct
	public void init() {
		OwnerDTO owner = new OwnerDTO();
		/*
		 * set Values
		 */
		ownerList.add(owner);
	}

	@Override
	public void saveOwner(OwnerDTO owner) {
		ownerList.add(owner);
	}

	@Override
	public Optional<OwnerDTO> findOwnerById(int ownerId) {
		return ownerList.stream().filter(owner -> owner.getOwnerId() == ownerId).findFirst();
	}

	@Override
	public void updateOwner(int ownerId, String petNewName) {
		ownerList.stream().filter(owner -> owner.getOwnerId() == ownerId).findFirst()
				.ifPresent(owner -> owner.getPetDTO().setPetName(petNewName));
	}

	@Override
	public void deleteOwner(int ownerId) {
		ownerList.removeIf(owner -> owner.getOwnerId() == ownerId);
	}

	@Override
	public List<OwnerDTO> findAllOwners() {
		return ownerList;
	}

}
