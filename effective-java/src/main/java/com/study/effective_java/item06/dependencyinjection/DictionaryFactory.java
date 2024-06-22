package com.study.effective_java.item06.dependencyinjection;

import com.study.effective_java.item06.DefaultDictionary;

public class DictionaryFactory {

	public static DefaultDictionary get() {
		return new DefaultDictionary();
	}
}
