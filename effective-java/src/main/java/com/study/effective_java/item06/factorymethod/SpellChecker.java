package com.study.effective_java.item06.factorymethod;

import com.study.effective_java.item06.Dictionary;

public class SpellChecker {

	private Dictionary dictionary;

	public SpellChecker(DictionaryFactory dictionaryFactory) {
		this.dictionary = dictionaryFactory.getDictionary();
	}
}
