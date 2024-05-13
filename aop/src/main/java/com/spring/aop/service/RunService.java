package com.spring.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RunService {

	private RunService runService;

	@Autowired
	public void setRunService(RunService runService) {
		this.runService = runService;
	}

	public void external() {
		log.info("call external");
		internal(); //내부 메서드 호출(this.internal())
	}

	void external_v3() {
		log.info("call default method");
	}

	public void external_v2() {
		log.info("call external");
		runService.internal();
	}

	protected void internal() {
		log.info("call internal");
	}
}
