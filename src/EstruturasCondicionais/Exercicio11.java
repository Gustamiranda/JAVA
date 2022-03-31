package EstruturasCondicionais;

import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {

		double salarioDoColaborador = receberSalarioDeColaborador();

	}

	public static double receberSalarioDeColaborador() {

		return Double.parseDouble(JOptionPane.showInputDialog("Informe salário do colaborador: "));
	}

	public static double calcularAumentoDeVintePorCento(double salarioDoColaborador) {

		double percentual = 20.0 / 100.0;

		return salarioDoColaborador + (percentual * salarioDoColaborador);
	}

	public static double calcularAumentoDeQuinzePorCento() {

	}
}
