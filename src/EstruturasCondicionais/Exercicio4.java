package EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio4 {
	static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		char letra;

		System.out.print("Informe a letra");
		letra = scanner.next().charAt(0);

		boolean vogal = letra == 'a' || letra == 'i' || letra == 'e' || letra == 'o' || letra == 'u';

		Exibirresultado(vogal);
	}

	public static void Exibirresultado(boolean vogal) {

		if (vogal) {
			System.out.print("A letra é uma vogal");
		} else {
			System.out.print("A letra é uma consoanteF");
		}

	}
}
