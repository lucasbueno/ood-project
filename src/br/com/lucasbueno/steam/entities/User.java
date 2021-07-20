package br.com.lucasbueno.steam.entities;

import java.util.ArrayList;

public abstract class User {
	private String username;
	private String email;
	private ArrayList<Game> games;
	
	public User(String username) {
		this.username = username;
		this.email = "null";
		this.games = new ArrayList<Game>();
	}

	public User(String username, String email) {
		super();
		this.username = username;
		this.email = email;
		this.games = new ArrayList<Game>();
	}
	
	public User(String username, String email, ArrayList<Game> games) {
		super();
		this.username = username;
		this.email = email;
		this.games = games;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Game> getGames() {
		return games;
	}

	public void setGames(ArrayList<Game> games) {
		this.games = games;
	}
	
	public abstract String getType();
}
