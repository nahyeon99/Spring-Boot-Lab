package com.spring.aop.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@Import(RunLogAspect.class)
@SpringBootTest
class RunServiceTest {

	@Autowired
	RunService runService;

	@Test
	void external() {
		runService.external();
	}

	@Test
	void external_v2() {
		runService.external_v2();
	}

	@Test
	void internal() {
		runService.internal();
	}

	@Test
	void AopCheck() {
		log.info("runService class={}", runService.getClass());

		// 프록시 팩토리를 통해서 프록시가 생성되면 JDK 동적 프록시나, CGLIB 모두 참이다.
		Assertions.assertThat(AopUtils.isAopProxy(runService)).isTrue();
	}

}