package com.kruthik.petistan.exceptions;

public class PetNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public PetNotFoundException(String message) {
		super(message);
	}
}
