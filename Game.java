public class Game{
	// atributos da classe
	String name;
	double price;
	double discount;
	
	// um comportamento da classe Game
	double getFinalPrice(){
		return price - discount;
	}
}
