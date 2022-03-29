package estruturaDeDecisao;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {

		double metaDeFaturamentoAnual = receberMetaDeFaturamentoAnual();
		double faturamentoRealDaEmpresaNoUltimoAno = receberFaturamentoRealDaEmpresaNoUltimoAno();
		double mediaDoSalarioDoFuncionario = receberMediaSalarialDoFuncionarioParaOAnoAnterior();
		double OitentaPorcentoDaMeta = calculoDaPorcentagem(metaDeFaturamentoAnual);

		boolean FaturamentoFoiMaiorOuIgualMeta = verificarSeFaturamentoFoiMaiorOuIgualMeta(
				faturamentoRealDaEmpresaNoUltimoAno, metaDeFaturamentoAnual);
		boolean FaturamentoFoiIgualOuMaiorAOitentaPorcentoDaMeta = verificarSeFaturamentoFoiIgualOuMaiorAOitentaPorcentoDaMeta(
				OitentaPorcentoDaMeta, metaDeFaturamentoAnual, faturamentoRealDaEmpresaNoUltimoAno);

		ExibirResultado(FaturamentoFoiMaiorOuIgualMeta, mediaDoSalarioDoFuncionario,
				FaturamentoFoiIgualOuMaiorAOitentaPorcentoDaMeta, OitentaPorcentoDaMeta);
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

	public static boolean verificarSeFaturamentoFoiMaiorOuIgualMeta(double faturamentoRealDaEmpresaNoUltimoAno,
			double metaDeFaturamentoAnual) {

		return faturamentoRealDaEmpresaNoUltimoAno >= metaDeFaturamentoAnual;
	}

	public static double calculoDaPorcentagem(double metaDeFaturamentoAnual) {

		return (0.80 * metaDeFaturamentoAnual) / 100;
	}

	public static boolean verificarSeFaturamentoFoiIgualOuMaiorAOitentaPorcentoDaMeta(double PorcentagemDe80DaMeta,
			double metaDeFaturamentoAnual, double faturamentoRealDaEmpresaNoUltimoAno) {

		return faturamentoRealDaEmpresaNoUltimoAno < metaDeFaturamentoAnual
				&& faturamentoRealDaEmpresaNoUltimoAno >= PorcentagemDe80DaMeta;
	}

	public static void ExibirResultado(boolean FaturamentoFoiMaiorOuIgualMeta, double mediaDoSalarioDoFuncionario,
			boolean FaturamentoFoiIgualOuMaiorAOitentaPorcentoDaMeta, double OitentaPorcentoDaMeta) {

		if (FaturamentoFoiMaiorOuIgualMeta) {

			JOptionPane.showMessageDialog(null, "Seu prêmio será: " + mediaDoSalarioDoFuncionario);
		} else if (FaturamentoFoiIgualOuMaiorAOitentaPorcentoDaMeta) {

			JOptionPane.showMessageDialog(null, "Seu prêmio será: " + OitentaPorcentoDaMeta);
		}

	}
}