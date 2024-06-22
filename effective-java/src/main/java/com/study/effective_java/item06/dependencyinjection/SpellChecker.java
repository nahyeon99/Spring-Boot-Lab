package com.study.effective_java.item06.dependencyinjection;

import java.util.List;
import java.util.function.Supplier;

import com.study.effective_java.item06.Dictionary;

public class SpellChecker {

	private final Dictionary dictionary;

	public SpellChecker(Dictionary dictionary) {
		this.dictionary = dictionary;
	}

	public SpellChecker(Supplier<Dictionary> dictionarySupplier) {
		this.dictionary = dictionarySupplier.get();
	}

	public boolean isValid(String word) {
		// TODO: 여기 SpellChecker code
		return dictionary.contains(word);
	}

	public List<String> suggestions(String typo) {
		// TODO: 여기 SpellChecker code
		return dictionary.closeWordsTo(typo);
	}
}
