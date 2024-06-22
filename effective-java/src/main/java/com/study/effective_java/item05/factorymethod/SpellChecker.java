package com.study.effective_java.item05.factorymethod;

import com.study.effective_java.item05.Dictionary;

public class SpellChecker {

	private Dictionary dictionary;

	public SpellChecker(DictionaryFactory dictionaryFactory) {
		this.dictionary = dictionaryFactory.getDictionary();
	}
}
