package Orientacao_a_objetos_parte2.exercicio_interface_e_polimorfismo;

public class Imovel implements Seguravel {
	private double valorMercado;
	private double areaConstruida;

	public Imovel(double valorMercado, double areaConstruida) {
		super();
		this.valorMercado = valorMercado;
		this.areaConstruida = areaConstruida;
	}

	public String obterDescricao() {

		return "Imovel com área construida de " + this.areaConstruida + "m2 e valor de mercado " + this.valorMercado;
	}

	@Override
	public double calcularValorApolice() {
		double valorApolice = this.valorMercado * 0.003;
		valorApolice = valorApolice + (areaConstruida * 0.5);
		return valorApolice;
	}

}
