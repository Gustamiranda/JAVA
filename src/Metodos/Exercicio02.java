package Metodos;

/*
Identifique um novo padr�o no algoritmo do c�digo anterior.
Estude um pouco mais o algoritmo do c�digo passado, e identifique algum trecho dele que pode ser separado para colocar
em um novo m�todo criado por voc�.
 */

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		imprimirTraco();
		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avan�ado" };

		mostrarVetor(cursos);

		System.out.print("O curso que voc� deseja � o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;

		if (!posicaoValida) {

			exibirERRO();
		}
		imprimirTraco();
		String[] formasPagamento = new String[] { "Cart�o", "Boleto" };
		System.out.println("Escolha dentre as formas de pagamento abaixo: ");

		mostrarVetor(formasPagamento);

		System.out.print("Sua forma de pagamento escolhida �: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
		posicaoValida = posicaoFormaPagamentoEscolhida >= 0 && posicaoFormaPagamentoEscolhida < formasPagamento.length;

		if (!posicaoValida) {
			exibirERRO();
		}

		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		imprimirTraco();
		System.out.println(
				"O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento � " + formaPagamentoEscolhida);
		scanner.close();
	}

	static void imprimirTraco() {
		System.out.println("----------------------------------------------");
	}

	static void exibirERRO() {
		System.err.println("Posi��o inv�lida!");
		System.exit(1);
	}

	static void mostrarVetor(String vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("[" + i + "] " + vetor[i]);
		}
	}

}