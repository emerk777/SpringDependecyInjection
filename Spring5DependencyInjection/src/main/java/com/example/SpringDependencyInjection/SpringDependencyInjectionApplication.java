package com.example.SpringDependencyInjection;

import com.example.SpringDependencyInjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDependencyInjectionApplication.class, args);
                
                MyController myController = (MyController) ctx.getBean("myController");
                
                String greeting = myController.sayHello();
                
                System.out.println(greeting);
	}

}
