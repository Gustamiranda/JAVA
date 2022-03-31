package EstruturasCondicionais;

import javax.swing.JOptionPane;

public class Exercicio11 {

	static final double AUMENTO_DE_VINTE_PORCENTO = 20.0 / 100.0;
	static final double AUMENTO_DE_QUINZE_PORCENTO = 15.0 / 100.0;
	static final double AUMENTO_DE_DEZ_PORCENTO = 10.0 / 100.0;
	static final double AUMENTO_DE_CINCO_PORCENTO = 5.0 / 100.0;

	public static void main(String[] args) {

		double salarioDoColaborador = receberSalarioDeColaborador();

		boolean salarioAte280 = aumentarVintePorCento(salarioDoColaborador);
		boolean salarioAte700 = aumentarQuinzePorCento(salarioDoColaborador);
		boolean salarioAte1500 = aumentarDezPorCento(salarioDoColaborador);
		boolean salarioAcimaDe1500 = aumentarCincoPorCento(salarioDoColaborador);

		exibirResultado(salarioDoColaborador, salarioAte280, salarioAte700, salarioAte1500, salarioAcimaDe1500);

	}

	public static double receberSalarioDeColaborador() {

		return Double.parseDouble(JOptionPane.showInputDialog("Informe salário do colaborador: "));
	}

	public static boolean aumentarVintePorCento(double salarioDoColaborador) {

		return salarioDoColaborador <= 280.0;
	}

	public static boolean aumentarQuinzePorCento(double salarioDoColaborador) {

		return salarioDoColaborador > 280.0 && salarioDoColaborador <= 700;
	}

	public static boolean aumentarDezPorCento(double salarioDoColaborador) {

		return salarioDoColaborador > 700.0 && salarioDoColaborador <= 1500.0;
	}

	public static boolean aumentarCincoPorCento(double salarioDoColaborador) {

		return salarioDoColaborador > 1500.0;
	}

	public static void exibirResultado(double salarioDoColaborador, boolean salarioAte280, boolean salarioAte700,
			boolean salarioAte1500, boolean salarioAcimaDe1500) {
		if (salarioAte280) {
			JOptionPane.showMessageDialog(null, "salário antes do reajuste: " + salarioDoColaborador + "R$");
			JOptionPane.showMessageDialog(null, "percentual de aumento aplicado: " + AUMENTO_DE_VINTE_PORCENTO + "%");
			JOptionPane.showMessageDialog(null,
					"valor do aumento: " + ((AUMENTO_DE_VINTE_PORCENTO * salarioDoColaborador)));
			JOptionPane.showMessageDialog(null, " novo salário, após o aumento: " + salarioDoColaborador
					+ (AUMENTO_DE_VINTE_PORCENTO * salarioDoColaborador));
		} else if (salarioAte700) {
			JOptionPane.showMessageDialog(null, "salário antes do reajuste: " + salarioDoColaborador + "R$");
			JOptionPane.showMessageDialog(null, "percentual de aumento aplicado: " + AUMENTO_DE_VINTE_PORCENTO + "%");
			JOptionPane.showMessageDialog(null,
					"valor do aumento: " + ((AUMENTO_DE_QUINZE_PORCENTO * salarioDoColaborador)));
			JOptionPane.showMessageDialog(null, " novo salário, após o aumento: " + salarioDoColaborador
					+ (AUMENTO_DE_QUINZE_PORCENTO * salarioDoColaborador));
		} else if (salarioAte1500) {
			JOptionPane.showMessageDialog(null, "salário antes do reajuste: " + salarioDoColaborador + "R$");
			JOptionPane.showMessageDialog(null, "percentual de aumento aplicado: " + AUMENTO_DE_DEZ_PORCENTO + "%");
			JOptionPane.showMessageDialog(null,
					"valor do aumento: " + ((AUMENTO_DE_DEZ_PORCENTO * salarioDoColaborador)));
			JOptionPane.showMessageDialog(null, " novo salário, após o aumento: " + salarioDoColaborador
					+ (AUMENTO_DE_DEZ_PORCENTO * salarioDoColaborador));
		} else if (salarioAcimaDe1500) {
			JOptionPane.showMessageDialog(null, "salário antes do reajuste: " + salarioDoColaborador + "R$");
			JOptionPane.showMessageDialog(null, "percentual de aumento aplicado: " + AUMENTO_DE_CINCO_PORCENTO + "%");
			JOptionPane.showMessageDialog(null,
					"valor do aumento: " + ((AUMENTO_DE_CINCO_PORCENTO * salarioDoColaborador)));
			JOptionPane.showMessageDialog(null, " novo salário, após o aumento: " + salarioDoColaborador
					+ (AUMENTO_DE_CINCO_PORCENTO * salarioDoColaborador));
		}

	}

}
