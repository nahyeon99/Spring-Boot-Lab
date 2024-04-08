package com.spring.aop.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class RunServiceV2 {

	private final ObjectProvider<RunServiceV2> runServiceProvider;

	public void external() {
		log.info("call external");
		RunServiceV2 runService2 = runServiceProvider.getObject();
		runService2.internal();//외부 메서드 호출
	}

	protected void internal() {
		log.info("call internal");
	}
}
