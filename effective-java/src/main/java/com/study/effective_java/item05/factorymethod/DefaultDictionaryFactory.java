package com.study.effective_java.item05.factorymethod;

import com.study.effective_java.item05.DefaultDictionary;
import com.study.effective_java.item05.Dictionary;

public class DefaultDictionaryFactory implements DictionaryFactory {
	@Override
	public Dictionary getDictionary() {
		return new DefaultDictionary();
	}
}
