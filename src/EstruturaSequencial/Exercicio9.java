package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Informe a temperatura em Farenheit: ");
		int farenheit = scanner.nextInt(); 
				
		double celsius = 5 * (farenheit - 32) / 9.0;
				
				System.out.print( "A temperatura em Celsius eh"+ celsius);

	}

}
