package com.tutorials.Setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext(
						"com/tutorials/Setter/bean.xml");
		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();
	}
}
