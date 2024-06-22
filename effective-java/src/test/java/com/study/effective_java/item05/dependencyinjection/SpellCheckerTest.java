package com.study.effective_java.item05.dependencyinjection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.study.effective_java.item05.DefaultDictionary;

class SpellCheckerTest {

	@Test
	void isValid() {
		// Case 1
		SpellChecker spellChecker = new SpellChecker(DefaultDictionary::new);

		// Case 2
		SpellChecker spellChecker2 = new SpellChecker(DictionaryFactory::get);

		assertTrue(spellChecker.isValid("test"));
	}
}