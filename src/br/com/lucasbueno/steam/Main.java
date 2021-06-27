package br.com.lucasbueno.steam;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.lucasbueno.steam.entities.*;

/*
 * MVC: Model, View, Controller
 */

public class Main {

	static boolean printLog = true;
	static ArrayList<Developer> developers = new ArrayList<Developer>();
	static ArrayList<Player> players = new ArrayList<Player>();

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		in.useDelimiter("\r?\n");

		println("Seja bem-vindo!");
		/*
		 * CRUD = Create, Retrieve, Update, Delete
		 */
		while (true) {
			printMenu();
			int userOption = in.nextInt();

			if (userOption == 0) {
				break;
			}

			if (userOption == 1) {
				println("Qual o nome do desenvolvedor?");
				String name = in.next();
				Developer dev = new Developer(name);
				developers.add(dev);
			}

			if (userOption == 2) {
				for (int indexDev = 0; indexDev < developers.size(); indexDev++) {
					println("Desenvolvedor[" + indexDev + "]: " + developers.get(indexDev).getName());
				}
			}

			if (userOption == 3) {
				println("Qual o ID do desenvolvedor que será removido?");
				int indexDev = in.nextInt();

				if (indexDev < developers.size()) {
					developers.remove(indexDev);
					println("Desenvolvedor removido com sucesso!");
				} else {
					println("Digite um índice válido!");
				}
			}

			if (userOption == 4) {
				println("Qual o ID do desenvolvedor que será alterado?");
				int indexDev = in.nextInt();

				if (indexDev < developers.size()) {
					Developer dev = developers.get(indexDev);
					println("Qual será o novo nome do desenvolvedor " + dev.getName() + "?");
					String name = in.next();
					dev.setName(name);
					println("Desenvolvedor alterado com sucesso!");
				} else {
					println("Digite um índice válido!");
				}
			}
		}
		println("Até a próxima :)");
	}

	static void printMenu() {
		println("");
		println("---------------------");
		println("(0) para sair");
		println("(1) para cadastrar um desenvolvedor");
		println("(2) para listar os desenvolvedores cadastrados");
		println("(3) para remover um desenvolvedor");
		println("(4) para alterar um desenvolvedor");
		println("Digite sua opção:");
	}

	static void println(String content) {
		if (printLog)
			System.out.println(content);
	}
}
