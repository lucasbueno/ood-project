package br.com.lucasbueno.steam.entities;

public class Admin extends User {
	private String password;
	
	public Admin(String username, String email, String password) {
		super(username, email);
		this.password = password;
	}
	
	@Override
	public String getType() {
		return "Meu tipo é ADMIN";
	}
}
