package com.study.effective_java.item06.springIoC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.study.effective_java.item06.Dictionary;

@Configuration
public class AppConfig {

	@Bean
	public SpellChecker spellChecker(Dictionary dictionary) {
		return new SpellChecker(dictionary);
	}

	@Bean
	public Dictionary dictionary() {
		return new SpringDictionary();
	}
}
