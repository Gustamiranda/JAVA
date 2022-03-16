package EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio1 {
	static final float NOTA_MINIMA_PARA_PASSAR = 150;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe sua nota na prova de matemática: ");
		float notaDaProvaDeMatématica = scanner.nextFloat();

		System.out.print("Informe sua nota na prova de português: ");
		float notaDaProvaDePortugues = scanner.nextFloat();

		float somaDasDuasProvas = notaDaProvaDeMatématica + notaDaProvaDePortugues;

		boolean alcançouANotaMinima = somaDasDuasProvas >= 150;
		boolean nãoAlcançouAMédiaNaProvaDeMatématica = notaDaProvaDeMatématica < 60;
		boolean nãoAlcançouAMédiaNaProvaDePortugues = notaDaProvaDePortugues < 60;

		if (alcançouANotaMinima && nãoAlcançouAMédiaNaProvaDeMatématica || nãoAlcançouAMédiaNaProvaDePortugues) {
			System.out.print("NOTA NA PROVA DE MATEMATICA: " + notaDaProvaDeMatématica
					+ "\nNOTA NA PROVA DE PORTUGUES: " + notaDaProvaDePortugues + "NOTA FINAL: "+ somaDasDuasProvas);

		}
	}

}
