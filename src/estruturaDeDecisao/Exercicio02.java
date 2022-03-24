package estruturaDeDecisao;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {

		double metaDeFaturamento = receberMetaDeFaturamentoAnual();
		double faturamentoRealDaEmpresaNoUltimoAno = receberFaturamentoRealDaEmpresaNoUltimoAno();
		double mediaDoSalarioDoFuncionario = receberMediaSalarialDoFuncionarioParaOAnoAnterior();

		boolean funcionarioPodeReceberOBonus = darBonusAoFuncionario(faturamentoRealDaEmpresaNoUltimoAno,
				metaDeFaturamento);

	}

	public static double receberMetaDeFaturamentoAnual() {

		return Double.parseDouble(JOptionPane.showInputDialog("Informe a meta de faturamento anual: "));
	}

	public static double receberFaturamentoRealDaEmpresaNoUltimoAno() {

		return Double.parseDouble(JOptionPane.showInputDialog("Informe faturamento real da empresa no ultimo ano: "));
	}

	public static double receberMediaSalarialDoFuncionarioParaOAnoAnterior() {

		return Double.parseDouble(
				JOptionPane.showInputDialog("Informe a  média salarial do funcionário(a) para o ano anterior"));
	}

	public static boolean darBonusAoFuncionario(double faturamentoRealDaEmpresaNoUltimoAno, double metaDeFaturamento) {

		return faturamentoRealDaEmpresaNoUltimoAno >= metaDeFaturamento;
	}

}
