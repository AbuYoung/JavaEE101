package com.tutorials.Setter;

public class TextEditor {

	private SpellChecker spellChecker;

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChceker.");
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	void spellCheck() {
		spellChecker.checkSpelling();
	}
}
