package Iteracao;

public class Exercicio02 {

	static final Integer DIVISOR = 3;

	public static void main(String[] args) {

		Integer numeros[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 };

		int i = 0;
		while (i < numeros.length) {

			Integer divisao = numeros[i] % DIVISOR;

			if (divisao.equals(0)) {
				System.out.print("\nO numero " + numeros[i] + " é divisível por 3");
			}

			i++;
		}

	}

}
