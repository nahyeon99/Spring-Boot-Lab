package com.study.effective_java.item05.factorymethod;

import com.study.effective_java.item05.Dictionary;
import com.study.effective_java.item05.MockDictionary;

public class MockDictionaryFactory implements DictionaryFactory {
	@Override
	public Dictionary getDictionary() {
		return new MockDictionary();
	}
}
