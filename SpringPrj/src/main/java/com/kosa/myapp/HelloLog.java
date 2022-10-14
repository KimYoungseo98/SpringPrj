package com.kosa.myapp;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HelloLog {
	@Pointcut(value="execution(* com..*.sayHello(..))")
	public void helloPointcut() {}
	
	@Before("helloPointcut()")
	public static void log() {
		System.out.println(">>>LOG: " + new java.util.Date());
	}
	
	@AfterReturning(pointcut="helloPointcut()", returning="result") //returning은 공통코드의 메서드 이름과 같아야 함
	public void resultLog(JoinPoint joinPoint, Object result) {
		System.out.println(joinPoint.getSignature());
		System.out.println(">>>핵심코드 실행 결과: "+result.toString());
	}
}
