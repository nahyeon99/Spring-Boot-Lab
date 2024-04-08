package com.spring.aop.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(RunLogAspect.class)
@SpringBootTest
class RunServiceV2Test {

	@Autowired
	RunServiceV2 runServicV2;

	@Test
	void external() {
		runServicV2.external();
	}
}
