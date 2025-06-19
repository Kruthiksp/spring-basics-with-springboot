package com.kruthik.petistan.dto;

import com.kruthik.petistan.enums.Gender;
import com.kruthik.petistan.enums.PetType;

import lombok.Data;

@Data
public class PetDTO {
	private int petId;
	private String petName;
	private Gender gender;
	private PetType petType;
	private OwnerDTO ownerDTO;
}
