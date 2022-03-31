package EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio9 {

	static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		 receberTresNumeros();
	}

	public static void receberTresNumeros() {
		
		int[] numeros = new int[3];
		
		for(int c = 0; c< numeros.length; c++) {
			
			System.out.print("Digite o "+ (c+1) +"° número: ");
			numeros[c] = scanner.nextInt();
		
		}
	
	
	
	}
	


}
