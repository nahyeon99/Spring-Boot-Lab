package com.study.effective_java.item05.staticutils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SpellCheckerTest {

	@Test
	void isValid() {
		Assertions.assertTrue(SpellChecker.isValid("test"));
	}
}