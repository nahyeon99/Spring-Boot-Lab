package com.study.effective_java.item06.factorymethod;

import com.study.effective_java.item06.DefaultDictionary;
import com.study.effective_java.item06.Dictionary;

public class DefaultDictionaryFactory implements DictionaryFactory {
	@Override
	public Dictionary getDictionary() {
		return new DefaultDictionary();
	}
}
