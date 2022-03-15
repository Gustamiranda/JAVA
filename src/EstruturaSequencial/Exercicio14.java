package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double multaPorQuilo = 4.0, pesoMaximo = 50.0;
		System.out.print("Informe o peso dos peixes pescados: ");
		float peso = scanner.nextFloat();

		if (peso > pesoMaximo) {
			double excesso = peso - pesoMaximo;
			System.out.print("Excesso de peso: " + excesso);
			System.out.print("Valor da multa por excesso: " + (excesso * multaPorQuilo) + "R$");
		} else {
			System.out.print("Nao houve excesso de peso");
		}
	}

}
