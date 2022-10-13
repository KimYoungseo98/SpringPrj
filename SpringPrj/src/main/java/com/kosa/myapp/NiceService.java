package com.kosa.myapp;

import org.springframework.stereotype.Service;

@Service
public class NiceService implements IHelloService {

	@Override
	public String sayHello(String name) {
		System.out.println("NiceService.sayHello()메서드 실행");
		String message = "Nice~~~" + name;
		return message;
	}

	@Override
	public String sayGoodbye(String name) {
		String message="Nice Goodbye~~~~"+name;
		return message;
	}

}