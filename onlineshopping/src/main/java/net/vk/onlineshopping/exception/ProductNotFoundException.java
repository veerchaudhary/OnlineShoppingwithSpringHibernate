package net.vk.onlineshopping.exception;

import java.io.Serializable;

public class ProductNotFoundException extends Exception implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	
	public ProductNotFoundException() {
		this("Product is not available!");
	}
	
	public ProductNotFoundException(String msg) {
		this.message = System.currentTimeMillis()+": "+msg;
	}

	public String getMessage() {
		return this.message;
	}



}
