package com.kruthik.petistan.exceptions;

public class OwnerNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public OwnerNotFoundException(String message) {
		super(message);
	}
}
