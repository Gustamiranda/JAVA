package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double pesoIdeal;
		
		System.out.print("Informe seu sexo (M/F): ");
		char sexo = scanner.next().charAt(0);
		System.out.print("Informe sua altura (em metros): ");
		float altura = scanner.nextFloat();
		System.out.print("Informe o seu peso (em kg): ");
		float peso = scanner.nextFloat();
		
		
		if (sexo == 'M' || sexo == 'm') {
		    pesoIdeal = (72.7 * altura) - 58;
		}
   		else {
		    pesoIdeal = (62.1 * altura) - 44.7;
		}
		
		if (peso > pesoIdeal) {
			System.out.print("Voce esta acima do seu peso ideal: "+ pesoIdeal);
		}
		else if (peso < pesoIdeal) {
			System.out.print("Voce esta abaixo do seu peso ideal:"+ pesoIdeal);
	  }
		    else {
		    	System.out.print("Voce esta no seu peso ideal: "+ pesoIdeal);
	
		    }
		    
}

}
