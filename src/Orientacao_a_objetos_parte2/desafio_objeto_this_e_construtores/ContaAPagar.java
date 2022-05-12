package Orientacao_a_objetos_parte2.desafio_objeto_this_e_construtores;

public class ContaAPagar {

	String descricao;
	Double valor;
	String dataDeVencimento;
	fornecedor Fornecedor;

	public ContaAPagar(fornecedor Fornecedor, String descricao, Double valor, String dataDeVencimento) {

		this.descricao = descricao;
		this.valor = valor;
		this.dataDeVencimento = dataDeVencimento;
		this.Fornecedor = Fornecedor;
	}

	public ContaAPagar() {
		// TODO Auto-generated constructor stub
	}

	void pagar() {
		System.out.println("Pagando conta: " + this.getDescricao() + "no valor de " + this.getValor()
				+ " do fornecedor " + this.getFornecedor());

	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDataDeVencimento() {
		return dataDeVencimento;
	}

	public void setDataDeVencimento(String dataDeVencimento) {
		this.dataDeVencimento = dataDeVencimento;
	}

	public fornecedor getFornecedor() {
		return Fornecedor;
	}

	public void setFornecedor(fornecedor fornecedor) {
		Fornecedor = fornecedor;
	}

}
