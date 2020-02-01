package com.tutorials.Setter;

public class TextEditor {

	private SpellChecker spellChecker;

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChceker.");
		this.spellChecker = spellChecker;
	}

	void spellCheck() {
		spellChecker.checkSpelling();
	}
}
