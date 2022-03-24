package EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio4 {
	static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Informe a letra: ");
		char letra = scanner.next().charAt(0);

		boolean Letravogal = vogal(letra);

		Exibirresultado(Letravogal);
	}

	public static boolean vogal(char letra) {

		return letra == 'a' || letra == 'i' || letra == 'e' || letra == 'o' || letra == 'u';

	}

	public static void Exibirresultado(boolean Letravogal) {

		if (Letravogal) {
			System.out.print("A letra é uma vogal");
		} else {
			System.out.print("A letra é uma consoante");
		}

	}
}
