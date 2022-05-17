package Orientacao_a_objetos_parte2.enumeracoes;

public enum Naip {

	OURO("Vermelho"), PAUS("Preto"), ESPADA("Preto"), COPAS("Vermelho");

	private String cor;

	Naip(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

}
