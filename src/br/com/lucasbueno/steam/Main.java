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
	static ArrayList<Game> games = new ArrayList<Game>();
	static ArrayList<User> users = new ArrayList<User>();
	static ArrayList<Admin> admins = new ArrayList<Admin>();

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
				println("Qual o email do desenvolvedor?");
				String email = in.next();
				println("Qual o endereço do desenvolvedor?");
				String address = in.next();
				Developer dev = new Developer(name, email, address);
				developers.add(dev);
				users.add(dev);
			}

			if (userOption == 2) {
				for (int indexDev = 0; indexDev < developers.size(); indexDev++) {
					println("Desenvolvedor[" + indexDev + "]: " + developers.get(indexDev).getUsername());
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
					println("Qual será o novo nome do desenvolvedor " + dev.getUsername() + "?");
					String name = in.next();
					dev.setUsername(name);
					println("Qual será o novo email do desenvolvedor " + dev.getUsername() + "?");
					String email = in.next();
					dev.setEmail(email);
					println("Qual será o novo endereço do desenvolvedor " + dev.getUsername() + "?");
					String address = in.next();
					dev.setAddress(address);
					println("Desenvolvedor alterado com sucesso!");
				} else {
					println("Digite um índice válido!");
				}
			}

			if (userOption == 5) {
				println("Qual o nome do jogo?");
				String name = in.next();
				println("Qual o preço do jogo?");
				double price = in.nextDouble();
				println("Qual o desconto do jogo?");
				double discount = in.nextDouble();
				println("Qual o nome do desenvolvedor?");
				String developerName = in.next();

				// percorro todo o vetor/lista e busco o desenvolvedor informado
				Developer developer = null;
				for (int developerIndex = 0; developerIndex < developers.size(); developerIndex++) {
					if (developers.get(developerIndex).getUsername() == developerName) {
						developer = developers.get(developerIndex);
						break;
					}
				}

				Game game = new Game(name, price, discount, developer);
				games.add(game);
				
				System.out.println("Preço em dólar: " + game.getPrice());
				System.out.println("Preço em real: " + game.getPrice(5));
			}

			if (userOption == 6) {
				println("Qual o nome do jogador?");
				String name = in.next();
				println("Qual o email do jogador?");
				String email = in.next();
				Player player = new Player(name, email);
				players.add(player);
				users.add(player);
			}

			if (userOption == 7) {
				for (int indexUser = 0; indexUser < users.size(); indexUser++) {
					User user = users.get(indexUser);
					println("Usuário[" + indexUser + "]: " + user.getUsername() + " - " + user.getType());
				}
			}

			if (userOption == 8) {
				println("Qual o nome do administrador?");
				String name = in.next();
				println("Qual o email do administrador?");
				String email = in.next();
				println("Qual a senha do administrador?");
				String password = in.next();
				Admin admin = new Admin(name, email, password);
				admins.add(admin);
				users.add(admin);
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
		println("(5) para cadastrar um jogo");
		println("(6) para cadastrar um jogador");
		println("(7) para listar os usuários");
		println("(8) para cadastrar um administrador");
		println("Digite sua opção:");
	}

	static void println(String content) {
		if (printLog)
			System.out.println(content);
	}
}
