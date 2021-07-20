package br.com.lucasbueno.steam.entities;

import java.util.ArrayList;

public class Player extends User {
	private ArrayList<Player> friends;

	public Player(String username, String email) {
		super(username, email);
		this.friends = new ArrayList<Player>();
	}

	public ArrayList<Player> getFriends() {
		return friends;
	}

	public void setFriends(ArrayList<Player> friends) {
		this.friends = friends;
	}
	
	@Override
	public String getUsername() {
		return "ESTE MÉTODO FOI SOBRESCRITO " + super.getUsername();
	}

	@Override
	public String getType() {
		return "Meu tipo é PLAYER";
	}
}
