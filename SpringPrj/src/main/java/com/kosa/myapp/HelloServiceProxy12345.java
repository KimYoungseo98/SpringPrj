package com.kosa.myapp;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceProxy12345 extends HelloService {// target object를 상속
	@Override
	public String sayHello(String name) {
		HelloLog.log();
		String message = super.sayHello(name); //상속받은 부모의 메서드 실행
		return message;
	}

}
