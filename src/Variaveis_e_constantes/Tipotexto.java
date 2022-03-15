package Variaveis_e_constantes;

import java.util.Scanner;

public class Tipotexto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome = scanner.nextLine();
		System.out.print("Olá " + nome + "!");
		scanner.close();
		Character variavelChar = 'B';
	}
}
