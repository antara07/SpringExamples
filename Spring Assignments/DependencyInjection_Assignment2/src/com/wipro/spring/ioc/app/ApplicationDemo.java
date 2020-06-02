package com.wipro.spring.ioc.app;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.spring.ioc.models.Player;




public class ApplicationDemo {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Player player1 =(Player) appContext.getBean("player1");
		Player player2 =(Player) appContext.getBean("player2");
		Player player3 =(Player) appContext.getBean("player3");
		Player player4 =(Player) appContext.getBean("player4");
		Player player5 =(Player) appContext.getBean("player5");
		
		System.out.println("List of All Players");
		System.out.println();
		player1.displayInfo();
		System.out.println();
		System.out.println("________________________________________________________________________");
		player2.displayInfo();
		System.out.println();
		System.out.println("________________________________________________________________________");
		player3.displayInfo();
		System.out.println();
		System.out.println("________________________________________________________________________");
		player4.displayInfo();
		System.out.println();
		System.out.println("________________________________________________________________________");
		player5.displayInfo();
		
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("Enter Coutry for Country wise List : (India/Sri Lanka)");
		String country=sc.nextLine();
		
		if(country.equalsIgnoreCase("India"))
		{
			
			System.out.println(player1.getPlayerName());
		
			System.out.println(player2.getPlayerName());
		}
		else if (country.equalsIgnoreCase("Sri Lanka"))
		{
			System.out.println(player3.getPlayerName());
			
			System.out.println(player4.getPlayerName());
		
			System.out.println(player5.getPlayerName());
		}
		
		else
			System.out.println("Player not found");

	}

}
