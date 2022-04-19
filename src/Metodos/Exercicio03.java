package Metodos;

import java.util.Scanner;

public class Exercicio03 {
	static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Informe o primeiro numero: ");
		int primeiroNumero = scanner.nextInt();

		System.out.println("Informe o segundo numero: ");
		int segundoNumero = scanner.nextInt();

		mostrarOperações();
		int Operação = escolherOperação();

	}

	public static void mostrarOperações() {
		System.out.print("Operações \n1= +  2= x  3= / 4 = - ");
	}

	public static int escolherOperação() {

		System.out.println("\nEscolha a opeação: ");
		int escolhaDeOperação = scanner.nextInt();

		return escolhaDeOperação;
	}

	public static void adicao(int primeiroNumero, int segundoNumero) {

		System.out.println(primeiroNumero + segundoNumero);
	}

	public static void multiplicacao(int primeiroNumero, int segundoNumero) {

		System.out.println(primeiroNumero * segundoNumero);
	}

	public static void Divisao(int primeiroNumero, int segundoNumero) {

		System.out.println(primeiroNumero / segundoNumero); 
	}

	public static void subtracao(int primeiroNumero, int segundoNumero) {

		System.out.println(primeiroNumero - segundoNumero); 
	}

}
