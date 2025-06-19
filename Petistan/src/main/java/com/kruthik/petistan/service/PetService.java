package com.kruthik.petistan.service;

import com.kruthik.petistan.dto.PetDTO;
import com.kruthik.petistan.exceptions.PetNotFoundException;

public interface PetService {
	PetDTO findPetById(int petId) throws PetNotFoundException;
}
