package programacao_orientada_a_objetos.Modelo;

import java.math.BigDecimal;

public class Produto {

	private long codigo;
	private String descricao;
	private BigDecimal valor;

	public Produto(long codigo, String descricao, BigDecimal valor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
