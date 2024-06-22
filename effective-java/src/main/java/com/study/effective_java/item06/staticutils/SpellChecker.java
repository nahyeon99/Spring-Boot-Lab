package com.study.effective_java.item06.staticutils;

import java.util.List;

import com.study.effective_java.item06.Dictionary;

public class SpellChecker {

	private static final Dictionary dictionary = new Dictionary();

	private SpellChecker() {
	}

	public static boolean isValid(String word) {
		// TODO: 여기 SpellChecker code
		return dictionary.contains(word);
	}

	public static List<String> suggestions(String typo) {
		// TODO: 여기 SpellChecker code
		return dictionary.closeWordsTo(typo);
	}
}
