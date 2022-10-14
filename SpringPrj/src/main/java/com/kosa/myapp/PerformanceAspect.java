package com.kosa.myapp;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;

@Component
public class PerformanceAspect {
	@Around("execution(* con..*.*(..))")
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {

		Signature s = joinPoint.getSignature();
		String methodName = s.getName();
		System.out.println("[Log]Before: " + methodName + "time check start");
		long startTime = System.nanoTime();

		Object result = null;

		try {
			result = joinPoint.proceed();
		} catch (Exception e) {
			System.out.println("[Log]Exception: " + methodName);
		} finally {
			System.out.println("[Log]Finally: " + methodName);
		}
		long endTime = System.nanoTime();
		System.out.println("[Log]After: " + methodName + " time check end");
		System.out.println("[Log]" + methodName + ": " + (endTime - startTime) + "ns");
		return result;
	}

}
