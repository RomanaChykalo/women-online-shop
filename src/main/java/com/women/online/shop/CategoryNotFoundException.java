package com.women.online.shop.exception;

public class CategoryNotFoundException extends RuntimeException {
	public CategoryNotFoundException(String message) {
		super(message);
	}
}
