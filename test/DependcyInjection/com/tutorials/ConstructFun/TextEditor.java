package com.tutorials.ConstructFun;

public class TextEditor {

	private SpellChecker spellChecker;
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside Texteditor constructor.");
		this.spellChecker = spellChecker;
	}

	void spellCheck(){
		spellChecker.checkSpelling();
	}

}
