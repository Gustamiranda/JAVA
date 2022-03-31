package EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio9 {

	static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		receberEOrdenarTresNumeros();
	}

	public static void receberEOrdenarTresNumeros() {

		int[] numeros = new int[3];

		for (int c = 0; c < numeros.length; c++) {

			System.out.print("Digite o " + (c + 1) + "° número: ");
			numeros[c] = scanner.nextInt();
		}

		boolean troca = true;
		int aux;
		while (troca) {
			troca = false;
			for (int i = 0; i < numeros.length - 1; i++) {
				if (numeros[i] < numeros[i + 1]) {
					aux = numeros[i];
					numeros[i] = numeros[i + 1];
					numeros[i + 1] = aux;
					troca = true;
				}
			}

		}
		System.out.print("Numeros em ordem decresente: ");
		for (int b = 0; b < numeros.length; b++) {

			System.out.print(numeros[b] + " , ");

		}

	}

}
