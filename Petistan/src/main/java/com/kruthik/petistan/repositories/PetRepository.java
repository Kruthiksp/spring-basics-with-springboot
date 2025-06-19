package com.kruthik.petistan.repositories;

import com.kruthik.petistan.dto.PetDTO;

public interface PetRepository {
	PetDTO findPetById(int petId);
}
