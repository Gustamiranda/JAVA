package Metodos;

/*
Identifique um novo padrão no algoritmo do código anterior.
Estude um pouco mais o algoritmo do código passado, e identifique algum trecho dele que pode ser separado para colocar
em um novo método criado por você.
 */

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		imprimirTraco();
		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };

		mostrarVetor(cursos);

		System.out.print("O curso que você deseja é o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;

		if (!posicaoValida) {

			exibirERRO();
		}
		imprimirTraco();
		String[] formasPagamento = new String[] { "Cartão", "Boleto" };
		System.out.println("Escolha dentre as formas de pagamento abaixo: ");

		mostrarVetor(formasPagamento);

		System.out.print("Sua forma de pagamento escolhida é: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
		posicaoValida = posicaoFormaPagamentoEscolhida >= 0 && posicaoFormaPagamentoEscolhida < formasPagamento.length;

		if (!posicaoValida) {
			exibirERRO();
		}

		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		imprimirTraco();
		System.out.println(
				"O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
		scanner.close();
	}

	static void imprimirTraco() {
		System.out.println("----------------------------------------------");
	}

	static void exibirERRO() {
		System.err.println("Posição inválida!");
		System.exit(1);
	}

	static void mostrarVetor(String vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("[" + i + "] " + vetor[i]);
		}
	}

}