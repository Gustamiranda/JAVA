package Metodos;

import java.util.Scanner;

public class Exercicio03 {
	static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Informe o primeiro numero: ");
		int primeiroNumero = scanner.nextInt();

		System.out.println("Informe o segundo numero: ");
		int segundoNumero = scanner.nextInt();

		Integer operacao = escolhaAOperacao(scanner);

		int resultado = calculo(operacao, primeiroNumero, segundoNumero);

		mostrarResultado(resultado);
	}

	static Integer escolhaAOperacao(Scanner scanner) {
		System.out.println("ESCOLHA A OPERAÇÃO");
		String[] operacoes = new String[] { "Subtração", "Adição","Divisão", "Multplicação" };
		for (int i = 0; i < operacoes.length; i++) {
			System.out.println("[" + (i+1)  + "] " + operacoes[i]);
		}
		System.out.print("Digite a operação: ");
		return scanner.nextInt();
	}

	static int calculo(Integer operacao, int primeiroNumero, int segundoNumero) {

		Integer calculo = null;

		switch (operacao) {

		case 1: {
			calculo = subtracao(primeiroNumero, segundoNumero);
			break;
		}
		case 2: {
			calculo = adicao(primeiroNumero, segundoNumero);
			break;
		}
		case 3: {
			calculo = Divisao(primeiroNumero, segundoNumero);
			break;
		}
		case 4: {
			calculo = multiplicacao(primeiroNumero, segundoNumero);
			break;
		}
		default:
			System.err.println("Escolha uma operação válida!");
			System.exit(0);
		}
		return calculo;
	}

	static int adicao(int primeiroNumero, int segundoNumero) {

		return primeiroNumero + segundoNumero;
	}

	static int subtracao(int primeiroNumero, int segundoNumero) {

		return primeiroNumero - segundoNumero;
	}

	static int Divisao(int primeiroNumero, int segundoNumero) {

		return primeiroNumero / segundoNumero;
	}

	static int multiplicacao(int primeiroNumero, int segundoNumero) {

		return primeiroNumero * segundoNumero;
	}

	static void mostrarResultado(int resultado) {

		System.out.println("Resultado: " + resultado);
	}
}
