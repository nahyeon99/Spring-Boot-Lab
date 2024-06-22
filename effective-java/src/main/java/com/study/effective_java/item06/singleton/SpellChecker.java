package com.study.effective_java.item06.singleton;

import java.util.List;

import com.study.effective_java.item06.DefaultDictionary;
import com.study.effective_java.item06.Dictionary;

public class SpellChecker {

	private final Dictionary dictionary = new DefaultDictionary();

	private SpellChecker() {
	}

	public static final SpellChecker INSTANCE = new SpellChecker();

	public boolean isValid(String word) {
		return dictionary.contains(word);
	}

	public List<String> suggestions(String typo) {
		return dictionary.closeWordsTo(typo);
	}
}
