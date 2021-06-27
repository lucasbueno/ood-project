package br.com.lucasbueno.steam.entities;
public class Game {
	private String name;
	private double price;
	private double discount;
	private Developer developer;

	public Game(String name, double price, double discount, Developer developer) {
		super();
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.developer = developer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.isBlank())
			return;
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price < 0)
			return;
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		// condições de saída do método
		if(discount < 0)
			return;
		if(discount > price)
			return;
		
		this.discount = discount;
	}

	public Developer getDeveloper() {
		return developer;
	}

	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}

	public double getFinalPrice() {
		return price - discount;
	}
}
