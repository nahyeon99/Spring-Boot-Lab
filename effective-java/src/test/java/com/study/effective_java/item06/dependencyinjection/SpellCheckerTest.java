package com.study.effective_java.item06.dependencyinjection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.study.effective_java.item06.DefaultDictionary;

class SpellCheckerTest {

	@Test
	void isValid() {
		SpellChecker spellChecker = new SpellChecker(new DefaultDictionary());
		assertTrue(spellChecker.isValid("test"));
	}
}