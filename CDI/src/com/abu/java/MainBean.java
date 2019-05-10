package com.abu.java;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

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

	public void createName() {
		this.salutation = rambean.GenName();
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
}
