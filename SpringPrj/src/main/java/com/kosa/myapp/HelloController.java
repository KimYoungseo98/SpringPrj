package com.kosa.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

   @Autowired //타입->변수이름으로 의존성 주입
   @Qualifier("helloService") //인터페이스를 구현한 클래스가 두 개 이상일 때 빈의 이름으로 의존성 주입 설정 Autowired와 같이 사용
   IHelloService helloService;         //=new HelloService();
   
//   public HelloController(IHelloService helloService) {
//      this.helloService=helloService;
//   }
   
//   public void setHelloService(IHelloService helloService) {
//      this.helloService=helloService;
//   }
   
   public void hello(String name) {
      System.out.println("HelloController:" + helloService.sayHello(name));
   }
   
   public void goodbye(String name) {
	   System.out.println("HelloController:"+helloService.sayGoodbye(name));
   }
}