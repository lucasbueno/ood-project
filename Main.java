import java.util.Scanner;
public class Main{
	static boolean printLog = true;
	static Developer[] developers = new Developer[999];
	static int numDevelopers = 0;

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		in.useDelimiter("\r?\n");
		
		println("Seja bem-vindo!");
		while(true){
			printMenu();
			int userOption = in.nextInt();
			
			if(userOption == 0){
				break;
			}
				
			if(userOption == 1){				
				Developer dev = new Developer();
				println("Qual o nome do desenvolvedor?");
				dev.name = in.next();
				
				developers[numDevelopers] = dev;
				numDevelopers++;
			}
			
			if(userOption == 2){
				for(int indexDev = 0; indexDev < numDevelopers; indexDev++){
					println("Desenvolvedor[" + indexDev + "]: " + developers[indexDev].name);
				}
			}
		}
		println("Até a próxima :)");
	}
	
	static void printMenu(){
		println("");
		println("---------------------");
		println("(0) para sair");
		println("(1) para cadastrar um desenvolvedor");
		println("(2) para listar os desenvolvedores cadastrados");
		println("Digite sua opção:");
	}
	
	static void println(String content){
		if(printLog)
			System.out.println(content);
	}
}
