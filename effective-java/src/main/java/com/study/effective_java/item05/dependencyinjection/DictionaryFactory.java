package com.study.effective_java.item05.dependencyinjection;

import com.study.effective_java.item05.DefaultDictionary;

public class DictionaryFactory {

	public static DefaultDictionary get() {
		return new DefaultDictionary();
	}
}
