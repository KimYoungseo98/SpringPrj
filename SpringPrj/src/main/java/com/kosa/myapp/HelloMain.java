package com.kosa.myapp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {
   public static void main(String[] args) {
/*      IHelloService helloService = new HelloService();
//      HelloController controller = new HelloController(helloService);
      // 기본생성자 생성자 매개변수를 가질 수 없음 set메서드로 만들면
      HelloController controller = new HelloController();
      controller.setHelloService(helloService);*/
      
      AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");
      HelloController controller=context.getBean(HelloController.class);
      controller.hello("홍길동");
      System.out.println();
      controller.goodbye("홍길서");
      context.close();

   }
}
