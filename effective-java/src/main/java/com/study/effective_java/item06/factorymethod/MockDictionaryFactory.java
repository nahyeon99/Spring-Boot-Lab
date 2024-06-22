package com.study.effective_java.item06.factorymethod;

import com.study.effective_java.item06.Dictionary;
import com.study.effective_java.item06.MockDictionary;

public class MockDictionaryFactory implements DictionaryFactory {
	@Override
	public Dictionary getDictionary() {
		return new MockDictionary();
	}
}
