package Metodos;

import java.util.Scanner;

public class Exercicio03 {
	static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Informe o primeiro numero: ");
		int primeiroNumero = scanner.nextInt();

		System.out.println("Informe o segundo numero: ");
		int segundoNumero = scanner.nextInt();

		mostrarOpera��es();
		int Opera��o = escolherOpera��o();

	}

	public static void mostrarOpera��es() {
		System.out.print("Opera��es \n1= +  2= x  3= / 4 = - ");
	}

	public static int escolherOpera��o() {

		System.out.println("\nEscolha a opea��o: ");
		int escolhaDeOpera��o = scanner.nextInt();

		return escolhaDeOpera��o;
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
