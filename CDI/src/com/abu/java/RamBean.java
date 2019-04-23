package com.abu.java;

import javax.enterprise.context.Dependent;
import java.util.Random;

@Dependent
public class RamBean {

	RamBean() {
	}

	String GenName() {
		Random newRan = new Random();
		return String.valueOf(newRan.nextInt(10));
	}

}
