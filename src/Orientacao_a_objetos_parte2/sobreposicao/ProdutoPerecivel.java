package Orientacao_a_objetos_parte2.sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto {

	protected Date dataValidade;

	public void identificar() {
		super.identificar();
	
		System.out.println("Minha descri��o �: " + dataValidade);
	}
}
