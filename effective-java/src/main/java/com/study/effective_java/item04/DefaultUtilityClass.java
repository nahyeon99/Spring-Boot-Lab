package com.study.effective_java.item04;

import org.springframework.context.annotation.AnnotationConfigUtils;

public class DefaultUtilityClass extends AnnotationConfigUtils {

	public static void main(String[] args) {
		DefaultUtilityClass utilityClass = new DefaultUtilityClass();
		utilityClass.registerAnnotationConfigProcessors(null);
	}
}
