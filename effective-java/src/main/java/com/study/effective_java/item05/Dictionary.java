package com.study.effective_java.item05;

import java.util.List;

public interface Dictionary {
	boolean contains(String word);

	List<String> closeWordsTo(String typo);
}