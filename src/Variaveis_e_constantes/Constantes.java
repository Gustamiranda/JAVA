package Variaveis_e_constantes;

import java.util.Scanner;

public class Constantes {

	static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe a sua idade: ");
		Integer idade = scanner.nextInt();

		boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA;

		if (podeTirarCarteira) {
			System.out.print("Sim, pode tirar carteira");
		} else {
			System.out.print("Não pode tirar carteira");
		}

	}

}
