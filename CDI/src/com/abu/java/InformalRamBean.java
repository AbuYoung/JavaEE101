package com.abu.java;

import javax.enterprise.context.Dependent;
import java.util.Random;

@Informal
@Dependent
public class InformalRamBean extends RamBean {

	//private static final long serialVersionUID = 1L;
	@Override
	String GenName() {
		Random newRan = new Random();
		return String.valueOf(newRan.nextInt(10));
	}

}
