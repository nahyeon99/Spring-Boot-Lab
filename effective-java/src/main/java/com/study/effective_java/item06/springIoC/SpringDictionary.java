package com.study.effective_java.item06.springIoC;

import java.util.List;

import com.study.effective_java.item06.Dictionary;

public class SpringDictionary implements Dictionary {
	@Override
	public boolean contains(String word) {
		System.out.println("contains " + word);
		return false;
	}

	@Override
	public List<String> closeWordsTo(String typo) {
		return null;
	}
}
