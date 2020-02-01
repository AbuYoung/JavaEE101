package com.tutorials.InnerInJection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext(
						"com/tutorials/InnerInJection/bean.xml");
		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();
		System.out.println("Hello World");

	}
}
