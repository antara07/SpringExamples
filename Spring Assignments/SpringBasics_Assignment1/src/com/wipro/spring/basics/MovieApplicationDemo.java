package com.wipro.spring.basics;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieApplicationDemo {
	
	public static void main(String args[])
	{
		ApplicationContext appContext= new ClassPathXmlApplicationContext("MovieConfig.xml");
		Movie movie= (Movie)appContext.getBean("movie");
		System.out.println("Movie Id    MovieName   MovieActor");
		System.out.println("----------------------------------");
		System.out.println(movie);
		
	}
}
