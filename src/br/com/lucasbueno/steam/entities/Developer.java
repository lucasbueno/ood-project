package br.com.lucasbueno.steam.entities;

import java.util.ArrayList;

public class Developer extends User {
	private String address;

	public Developer(String username, String email, String address) {
		super(username, email);
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String getType() {
		return "Meu tipo é DEVELOPER";
	}

}
