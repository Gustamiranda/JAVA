package Variaveis_e_constantes;

public class Tipologico {

	public static void main(String[] args) {
		boolean variavelVerdaeira = true;
		boolean variavelFalsa = false;
		System.out.println("Variavel verdadeira: " + variavelVerdaeira);

		System.out.println("Variavel falsa: " + variavelFalsa);

		Integer idade = 15;

		boolean podeTirarCarteira = idade >= 18;

		System.out.println("Pode tirar a carteira? " + podeTirarCarteira);

		if (podeTirarCarteira) {

			System.out.println("Sim");

		} else {
			System.out.print("Não");
		}

	}

}
