package com.abu.java;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@RequestScoped
@Named("mainBean")
public class MainBean {

	public MainBean() {
	}

	@Inject @Informal
	RamBean rambean;

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
