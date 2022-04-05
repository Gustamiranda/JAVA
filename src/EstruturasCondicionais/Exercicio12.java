package EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe  o valor da sua hora: ");
		double valorDaHora = scanner.nextInt();

		System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
		double HorasTrabalhadas = scanner.nextInt();

		double salarioBruto = HorasTrabalhadas * valorDaHora;

		boolean salarioAte900 = salarioBruto > 0 && salarioBruto <= 900;
		boolean salarioAte1500 = salarioBruto > 900 && salarioBruto <= 1500;
		boolean salarioAte2500 = salarioBruto > 1500 && salarioBruto <= 2500;
		boolean salarioAcimaDe2500 = salarioBruto > 2500;

		if (salarioAte900) {

			double descontoDoIR = salarioBruto * 0.5;
			double descontoDoINSS = salarioBruto * 0.10;
			double descontoDoFGTS = salarioBruto * 0.11;
			double totalDeDescontos = descontoDoIR + descontoDoINSS + descontoDoFGTS;
			
			System.out.print("Salário bruto: " + salarioBruto + "R$ ");
			System.out.println("Total de descontos: " + totalDeDescontos + "R$");
			System.out.println("Salário liquido: " + (salarioBruto - totalDeDescontos)+ "");
		
		}

	}

}
