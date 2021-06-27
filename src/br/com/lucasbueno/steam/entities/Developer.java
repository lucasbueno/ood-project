package br.com.lucasbueno.steam.entities;
public class Developer {
	private String name;

	// método construtor
	public Developer(String name) {
		this.name = name;
	}

	// método setter
	public void setName(String name) {
		if (name.isBlank())
			return;
		this.name = name;
	}

	// método getter
	public String getName() {
		return name;
	}

}
