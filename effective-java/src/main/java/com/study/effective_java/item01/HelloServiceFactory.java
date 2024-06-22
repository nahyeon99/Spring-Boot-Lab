package com.study.effective_java.item01;

import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {

	public static void main(String[] args) {
		HelloService ko = HelloService.of("ko");
		System.out.println(ko.hello());

		ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
		Optional<HelloService> helloServiceOptional = loader.findFirst();
		helloServiceOptional.ifPresent(h -> {
			System.out.println(h.hello());
		});
	}
}
