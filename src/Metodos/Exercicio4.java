package Metodos;

import java.util.Scanner;

public class Exercicio4 {

	static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int numeroParaMult = pedirNumero();

		mostrarTabuada(numeroParaMult);
	}

	static int pedirNumero() {

		System.out.print("Informe um numero: ");
		int numero = scanner.nextInt();
		return numero;
	}

	static void mostrarTabuada(int numeroParaMult) {
		System.out.println("Tabuada do numero "+ numeroParaMult + ": ");
		for (int i = 0; i <= 10; i++) {

			System.out.println("\n" + numeroParaMult + "X" + i + "= " + (numeroParaMult * i));
		}	
	}

}
