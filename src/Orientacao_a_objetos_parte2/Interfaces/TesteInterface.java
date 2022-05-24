package Orientacao_a_objetos_parte2.Interfaces;

public class TesteInterface {
	public void main(String[] args) {
		Imprimivel i = new NotaFiscal(1234);
		i.imprimir();
		EnviavelPorEmail e = (EnviavelPorEmail) i;
		e.enviar("GerundinoMacedônio@gmail.com");
		NotaFiscal n = (NotaFiscal) e;
		n.adicionarPedido("Caixa de leite");
 
	}
}
