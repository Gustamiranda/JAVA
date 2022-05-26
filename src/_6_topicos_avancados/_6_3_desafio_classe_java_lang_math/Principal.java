package _6_topicos_avancados._6_3_desafio_classe_java_lang_math;

import java.util.Scanner;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int quantidaDeJogos;

		System.out.println("Informe a quantidade de jogos a serem feitos: ");
		quantidaDeJogos = scanner.nextInt();

		Random aleatorio = new Random();

		for (int c = 0; c <= quantidaDeJogos; c++) {

			int sequencia = aleatorio.nextInt(quantidaDeJogos) + 1;

			System.out.println("sequencia de jogos: " + sequencia);
		}

	}

}
