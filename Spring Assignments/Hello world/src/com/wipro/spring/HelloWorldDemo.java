package com.wipro.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@Configuration
public class HelloWorldDemo {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("HelloWorldConfig.xml");		
		HelloWorld helloWorld= (HelloWorld)appContext.getBean("helloWorld");
		System.out.println(helloWorld.getMessage());
	}

}
