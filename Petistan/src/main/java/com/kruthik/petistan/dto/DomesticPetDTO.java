package com.kruthik.petistan.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class DomesticPetDTO extends PetDTO {
	private LocalDate dob;
}
