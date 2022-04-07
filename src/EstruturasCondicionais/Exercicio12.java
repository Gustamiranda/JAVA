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
		boolean salarioAcimaDe900 = salarioBruto > 900 && salarioBruto <= 1500;
		boolean salarioAcimaDe1500 = salarioBruto > 1500 && salarioBruto <= 2500;
		boolean salarioAcimaDe2500 = salarioBruto > 2500;

		double descontoDoImpostoDeRenda, totalDeDescontos;
		double descontoDoSindicato = salarioBruto * 0.3;

		if (salarioAte900) {
			System.out.print("Isento");
			System.out.print("\nSalário: " + salarioBruto + "R$");
		} else if (salarioAcimaDe900) {

			descontoDoImpostoDeRenda = salarioBruto * 0.5;
			totalDeDescontos = descontoDoImpostoDeRenda + descontoDoSindicato;

			System.out.print("Salário bruto: " + (salarioBruto) + "R$ ");
			System.out.print("\nTotal de descontos: " + totalDeDescontos + "R$");
			System.out.print("\nSalário liquido: " + (salarioBruto - totalDeDescontos) + "");
		} else if (salarioAcimaDe1500) {

			descontoDoImpostoDeRenda = salarioBruto * 0.10;
			totalDeDescontos = descontoDoImpostoDeRenda + descontoDoSindicato;

			System.out.print("Salário bruto: " + (salarioBruto) + "R$ ");
			System.out.println("\nTotal de descontos: " + totalDeDescontos + "R$");
			System.out.println("\nSalário liquido: " + (salarioBruto - totalDeDescontos) + "");
		} else if (salarioAcimaDe2500) {

			descontoDoImpostoDeRenda = salarioBruto * 0.20;
			totalDeDescontos = descontoDoImpostoDeRenda + descontoDoSindicato;

			System.out.print("Salário bruto: " + (salarioBruto) + "R$ ");
			System.out.println("\nTotal de descontos: " + totalDeDescontos + "R$");
			System.out.println("\nSalário liquido: " + (salarioBruto - totalDeDescontos) + "");
		} else {
			System.out.println("Valores inválidos");
		}
	}

}
