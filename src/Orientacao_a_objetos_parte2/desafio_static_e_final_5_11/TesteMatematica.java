package Orientacao_a_objetos_parte2.desafio_static_e_final_5_11;

public class TesteMatematica {

	public static void main(String[] args) {
		int numeroFibonacci = MatematicaUtil.calcularFibonacci(8);
		System.out.println("N?mero de Fibonacci da posi??o 8: " + numeroFibonacci);
		double areaCirculo = MatematicaUtil.calcularAreaCirculo(104.8);
		System.out.println("?rea do c?rculo: " + areaCirculo);
	}

}
