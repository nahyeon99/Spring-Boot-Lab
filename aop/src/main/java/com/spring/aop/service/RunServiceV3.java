package com.spring.aop.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class RunServiceV3 {

	private final InternalService internalService;

	public void external() {
		log.info("call external");
		internalService.internal();//외부 메서드 호출
	}
}
