package com.dest.springframework.springdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dest.springframework.springdi.controllers.ConstructorInjectedController;
import com.dest.springframework.springdi.controllers.MyController;
import com.dest.springframework.springdi.controllers.PropertyInjectedController;
import com.dest.springframework.springdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);
		
		MyController controller = (MyController)ctx.getBean("myController");
		
		System.out.println(controller.greetings("Bikash"));
		
		System.out.println("\n-------- Property");
		
		PropertyInjectedController propertyInjectedController =(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		
		System.out.println(propertyInjectedController.getGreeting());	
		
		System.out.println("\n-------- Setter");
		
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("\n-------- Constructor");
		
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		
		System.out.println(constructorInjectedController.getGreeting());
	}

}
