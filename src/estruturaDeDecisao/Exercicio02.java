package estruturaDeDecisao;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {

		double metaDeFaturamentoAnual = receberMetaDeFaturamentoAnual();
		double faturamentoRealDaEmpresaNoUltimoAno = receberFaturamentoRealDaEmpresaNoUltimoAno();
		double mediaDoSalarioDoFuncionario = receberMediaSalarialDoFuncionarioParaOAnoAnterior();
		double oitentaPorcentoDaMeta = calcularOitentaPorcentoDaMeta(metaDeFaturamentoAnual);

		boolean faturamentoFoiMaiorOuIgualMeta = verificarSeFaturamentoFoiMaiorOuIgualMeta(
				faturamentoRealDaEmpresaNoUltimoAno, metaDeFaturamentoAnual);
		boolean faturamentoFoiIgualOuMaiorAOitentaPorcentoDaMeta = verificarSeFaturamentoFoiIgualOuMaiorAOitentaPorcentoDaMeta(
				oitentaPorcentoDaMeta, metaDeFaturamentoAnual, faturamentoRealDaEmpresaNoUltimoAno);

		exibirResultado(faturamentoFoiMaiorOuIgualMeta, mediaDoSalarioDoFuncionario,
				faturamentoFoiIgualOuMaiorAOitentaPorcentoDaMeta, oitentaPorcentoDaMeta);
	}

	public static double receberMetaDeFaturamentoAnual() {

		return Double.parseDouble(JOptionPane.showInputDialog("Informe a meta de faturamento anual: "));
	}

	public static double receberFaturamentoRealDaEmpresaNoUltimoAno() {

		return Double.parseDouble(JOptionPane.showInputDialog("Informe faturamento real da empresa no ultimo ano: "));
	}

	public static double receberMediaSalarialDoFuncionarioParaOAnoAnterior() {

		return Double.parseDouble(
				JOptionPane.showInputDialog("Informe a  m�dia salarial do funcion�rio(a) para o ano anterior"));
	}

	public static boolean verificarSeFaturamentoFoiMaiorOuIgualMeta(double faturamentoRealDaEmpresaNoUltimoAno,
			double metaDeFaturamentoAnual) {

		return faturamentoRealDaEmpresaNoUltimoAno >= metaDeFaturamentoAnual;
	}

	public static double calcularOitentaPorcentoDaMeta(double metaDeFaturamentoAnual) {

		return (metaDeFaturamentoAnual * 0.8);
	}

	public static boolean verificarSeFaturamentoFoiIgualOuMaiorAOitentaPorcentoDaMeta(double porcentagemDe80DaMeta,
			double metaDeFaturamentoAnual, double faturamentoRealDaEmpresaNoUltimoAno) {

		return faturamentoRealDaEmpresaNoUltimoAno < metaDeFaturamentoAnual
				&& faturamentoRealDaEmpresaNoUltimoAno >= porcentagemDe80DaMeta;
	}

	public static void exibirResultado(boolean faturamentoFoiMaiorOuIgualMeta, double mediaDoSalarioDoFuncionario,
			boolean faturamentoFoiIgualOuMaiorAOitentaPorcentoDaMeta, double oitentaPorcentoDaMeta) {

		if (faturamentoFoiMaiorOuIgualMeta) {

			JOptionPane.showMessageDialog(null, "Seu pr�mio ser�: " + mediaDoSalarioDoFuncionario + "R$");
		} else if (faturamentoFoiIgualOuMaiorAOitentaPorcentoDaMeta) {

			JOptionPane.showMessageDialog(null, "Seu pr�mio ser�: " + oitentaPorcentoDaMeta + "R$");
		} else {
			JOptionPane.showMessageDialog(null, "N�o recebe pr�mio.");
		}
	}
}