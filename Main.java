public class Main{
	public static void main(String[] args){
		Game cs = new Game();
		cs.name = "Counter Strike";
		cs.price = 20;
		cs.discount = 5;
		
		System.out.println("O preço do jogo " + cs.name + " é " + cs.price);
		System.out.println("Mas, hoje estamos oferecendo um desconto, e ele ficará por " + cs.getFinalPrice());
		
		Game nfs = new Game();
		nfs.name = "Need For Speed";
		nfs.price = 40;
		nfs.discount = 10;
		
		System.out.println("O preço do jogo " + nfs.name + " é " + nfs.price);
		System.out.println("Mas, hoje estamos oferecendo um desconto, e ele ficará por " + nfs.getFinalPrice());
	}
}
