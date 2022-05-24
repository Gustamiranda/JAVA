package Orientacao_a_objetos_parte2.exercicio_interface_e_polimorfismo;

public class Carro implements Seguravel {

	private int anoFabricacao;
	private double valorMercado;

	public Carro(int anoFabricacao, double valorMercado) {
		super();
		this.anoFabricacao = anoFabricacao;
		this.valorMercado = valorMercado;
	}

	@Override
	public String obterDescricao() {
		return "Carro ano " + this.anoFabricacao + " com valor de mercado " + this.valorMercado;
	}

	@Override
	public double calcularValorApolice() {
		double valorApolice = this.valorMercado * 0.04;

		if (anoFabricacao < 2000) {
			valorApolice = valorApolice * 0.90;
		}

		return valorApolice;
	}

}
