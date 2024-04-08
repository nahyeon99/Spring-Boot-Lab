package com.spring.aop.service;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
public class RunLogAspect {

	@Before("execution(* com.spring.aop.service.RunService.*(..))")
	public void doLog(JoinPoint joinPoint) {

		MethodSignature signature = (MethodSignature)joinPoint.getSignature();
		Method method = signature.getMethod();

		log.info("실행 중인 메서드 : {}", method.getName());
	}
}
