package com.study.effective_java.item06.springIoC;

import java.util.List;

import com.study.effective_java.item06.Dictionary;

public class SpellChecker {

	private Dictionary dictionary;

	public SpellChecker(Dictionary dictionary) {
		this.dictionary = dictionary;
	}

	public boolean isValid(String word) {
		return dictionary.contains(word);
	}

	public List<String> suggestions(String typo) {
		return dictionary.closeWordsTo(typo);
	}
}
