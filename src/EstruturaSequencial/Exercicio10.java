package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em Farenheit: ");
		int celsius = scanner.nextInt(); 
				
		double farenheit = ((celsius / 5.0) * 9.0) + 32.0;
				
				System.out.print( "A temperatura em Celsius eh"+ farenheit);
	}

}
