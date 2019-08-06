package com.tutorials.ConstructFun;

public class SpellChecker {

	//用构造函数注入来实现依赖注入
	public SpellChecker() {
		System.out.println("Inside SpellChecker constructor.");
	}

	void checkSpelling() {
		System.out.println("Inside checkSpelling.");
	}

}
