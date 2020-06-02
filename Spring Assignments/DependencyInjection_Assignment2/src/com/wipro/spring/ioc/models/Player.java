package com.wipro.spring.ioc.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Player {
	
	private String playerId;
	private String playerName;
	@Autowired
	private Country country;
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	
	public void displayInfo()
	{
		System.out.println("Player Id : "+playerId+"\nPlayer Name : "+playerName+"\n"+country);
	}

}
