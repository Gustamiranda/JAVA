package Orientacao_a_objetos_parte2.desafio_objeto_this_e_construtores;

public class ContaAPagar {

	private static final SituacaoConta PENDENTE = null;
	private static final SituacaoConta PAGA = null;
	String descricao;
	Double valor;
	String dataDeVencimento;
	fornecedor Fornecedor;
	private SituacaoConta situacaoConta;

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

	public ContaAPagar(fornecedor Fornecedor, String descricao, Double valor, String dataDeVencimento) {

		this.descricao = descricao;
		this.valor = valor;
		this.dataDeVencimento = dataDeVencimento;
		this.Fornecedor = Fornecedor;
		this.situacaoConta = situacaoConta;
	}

	public ContaAPagar() {
		this.situacaoConta = PENDENTE;
	}

	void pagar() {
		if (SituacaoConta.PAGA.equals(getSituacaoConta())) {
			System.out.println("Não pode pagar uma conta que já está paga: " + getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(getSituacaoConta())) {
			System.out.println("Não pode pagar uma conta que já está cancelada: " + getDescricao() + ".");
		} else {

			System.out.println("Pagando conta: " + this.getDescricao() + "no valor de " + this.getValor()
					+ " do fornecedor " + this.getFornecedor());
		}

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
