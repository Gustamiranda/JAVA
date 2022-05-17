package Orientacao_a_objetos_parte2.enumeracoes;

public enum Naip {

	OURO("Vermleho"), PAUS("Preto"), ESPADA("Preto"), COPAS("Vermelho");

	private String cor;

	Naip(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

}
