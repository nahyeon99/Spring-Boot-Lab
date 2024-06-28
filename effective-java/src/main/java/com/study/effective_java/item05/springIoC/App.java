package com.study.effective_java.item05.springIoC;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		SpellChecker spellChecker = applicationContext.getBean(SpellChecker.class);
		spellChecker.isValid("hello");
	}
}
