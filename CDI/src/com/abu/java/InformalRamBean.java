package com.abu.java;

import javax.enterprise.context.Dependent;
import java.util.Random;

@Informal
@Dependent
public class InformalRamBean extends RamBean{

	@Override
	String GenName() {
		Random newRan = new Random();
		return String.valueOf(newRan.nextInt(10));
	}

}
