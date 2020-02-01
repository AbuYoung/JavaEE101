package com.tutorials.Lifecycle;

public class HelloWorld {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	void getMessage() {
		System.out.println("Your Message : " + message);
	}

	public void init() {
		System.out.println("Bean is going through init");
	}

	public void destroy() {
		System.out.println("Bean will be destroied now");
	}

}