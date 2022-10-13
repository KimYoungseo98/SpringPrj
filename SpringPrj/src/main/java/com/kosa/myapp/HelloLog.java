package com.kosa.myapp;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class HelloLog {
	public static void log() {
		System.out.println(">>>LOG: " + new java.util.Date());
	}
	public void resultLog(JoinPoint joinPoint, Object result) {
		System.out.println(joinPoint.getSignature());
		System.out.println(">>>핵심코드 실행 결과: "+result.toString());
	}
}
