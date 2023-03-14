package com.tutorialspoint;

public class TextEditor {
	private SpellChecker spellChecker1;
	
	public SpellChecker getSpellChecker() {
		return spellChecker1;
	}

	public void setSpellChecker(SpellChecker spellChecker1) {
		System.out.println("Inside setSpellChecker." );
		this.spellChecker1 = spellChecker1;
	}
	
	/*public TextEditor(SpellChecker spellChecker1) {
		System.out.println("Inside TextEditor Constructor ");
		this.spellChecker1 = spellChecker1;
	}*/
	

	public void spellCheck() {
		spellChecker1.checkSpelling();
	}
	
}
