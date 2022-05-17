package Orientacao_a_objetos_parte2.enumeracoes.Carta;

public class Carta {
	private int numero;
	private Naip naip;
	
	public Carta(int numero, Naip naip) {
		this.numero = numero;
		this.naip = naip;
	}

	public void imprimirCarta() {
		System.out.println("Sou "+ numero + " de "+ naip +". E tenho a cor "+ naip.getCor());
	}
}
