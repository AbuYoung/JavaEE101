package com.abu.java;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Random;

@Named("mainBean")
@RequestScoped

public class MainBean {

	public MainBean() {
	}

	@Inject
	@Informal
	RamBean rambean;

	//private static final long serialVersionUID = 1L;

	private String salutation;

	String GenName() {
		Random newRan = new Random();
		return String.valueOf(newRan.nextInt(10));
	}

	public void createName() {
		this.salutation = GenName();
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
}
