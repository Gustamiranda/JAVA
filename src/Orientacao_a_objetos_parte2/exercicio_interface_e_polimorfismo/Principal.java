package Orientacao_a_objetos_parte2.exercicio_interface_e_polimorfismo;

public class Principal {

	public static void main(String[] args) {

		CorretoraSeguros corretora = new CorretoraSeguros();
		Carro meuCarro = new Carro(2012, 45000d);
		Imovel minhaCasa = new Imovel(920000, 320);
		corretora.fazerPropostaSegura(meuCarro);
		corretora.fazerPropostaSegura(minhaCasa);
	}

}
