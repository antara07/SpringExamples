package com.wipro.spring.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan

public class MovieApplicationDemo {
			
	public static void main(String[] args) {
		
		 ApplicationContext appContext =new AnnotationConfigApplicationContext(MovieApplicationDemo.class);
		 MovieConfig movieConfig = appContext.getBean(MovieConfig.class);
		 System.out.println("Movie Id    MovieName   MovieActor");
		 System.out.println("----------------------------------");
		 System.out.println(movieConfig.getMovie());
	}

}
