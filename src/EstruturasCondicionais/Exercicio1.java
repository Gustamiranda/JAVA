package EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio1 {
	static final float NOTA_MINIMA_PARA_PASSAR = 150;

	public static void mostrarNotas() {

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe sua nota na prova de matemática: ");
		float notaDaProvaDeMatématica = scanner.nextFloat();

		System.out.print("Informe sua nota na prova de português: ");
		float notaDaProvaDePortugues = scanner.nextFloat();

		float somaDasDuasProvas = somaDasNotas(notaDaProvaDeMatématica, notaDaProvaDePortugues);

		boolean alcançouANotaMinima = somaDasDuasProvas >= 150;
		boolean nãoAlcançouAMédiaNaProvaDeMatématica = notaDaProvaDeMatématica < 60;
		boolean nãoAlcançouAMédiaNaProvaDePortugues = notaDaProvaDePortugues < 60;

		if (nãoAlcançouAMédiaNaProvaDeMatématica || nãoAlcançouAMédiaNaProvaDePortugues && alcançouANotaMinima) {

			System.out.print("Nota na prova de matématica: " + notaDaProvaDeMatématica
					+ "\nNota na prova de português: " + notaDaProvaDePortugues + "\nNota final: " + somaDasDuasProvas);

			System.out.print("\nInfelizmente você não passou.");
		} else if (alcançouANotaMinima) {
			System.out.print("Nota na prova de matématica: " + notaDaProvaDeMatématica
					+ "\nNota na prova de português: " + notaDaProvaDePortugues + "\nNota final: " + somaDasDuasProvas);

			System.out.print("\nParabéns, você passou.");
		} else {

			System.out.print("Nota na prova de matématica: " + notaDaProvaDeMatématica
					+ "\nNota na prova de português: " + notaDaProvaDePortugues + "\nNota final: " + somaDasDuasProvas);

			System.out.print("\nInfelizmente você não passou.");
		}

	}

	public static float somaDasNotas(float notaDaProvaDeMatématica, float notaDaProvaDePortugues) {

		return notaDaProvaDeMatématica + notaDaProvaDePortugues;
	}

}
