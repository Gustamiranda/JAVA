package Operadores;

/*
* Para criar uma calculadora simples iremos precisar receber tr�s informa��es pelo console.
* S�o os dois n�meros que participar�o da opera��o e tamb�m a opera��o que ser� realizada.
*
* Voc� vai receber o premeiro n�mero, depois vai receber qual � a opera��o e, por �ltimo, o segundo n�mero.
*
* Para os n�meros que voc� vai receber pelo console, pode utilidar a mesma funcionalidade que j� utilizamos aqui (Scanner).
* Para receber a opera��o voc� pode receber tamb�m um n�mero que vai indicar a mesma. Por exemplo, o n�mero 1 ser� adi��o,
* o 2 subtra��o, o 3 multiplica��o e o 4 divis�o.
*
* Com esses tr�s valores - os dois n�meros e qual ser� a opera��o - voc� pode utilizar a estrutura de decis�o if para
* s� realizar a opera��o que o usu�rio escolheu. Se estiver com d�vidas, ent�o volte ao material onde falamos sobre
* altera��o do valor de uma vari�vel. */

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro numero: ");
		Double primeiroNumero = scanner.nextDouble();

		System.out.print("Operacao [1 = + | 2 = - | 3 = * | 4 = /]: ");
		Integer operacao = scanner.nextInt();

		System.out.print("Digite o segundo numero: ");
		Double segundoNumero = scanner.nextDouble();

		Double resultado = null;

		if (operacao.equals(1)) {
			resultado = primeiroNumero + segundoNumero;
		}

		if (operacao.equals(2)) {
			resultado = primeiroNumero - segundoNumero;
		}

		if (operacao.equals(3)) {
			resultado = primeiroNumero * segundoNumero;
		}

		if (operacao.equals(4)) {
			resultado = primeiroNumero / segundoNumero;
		}

		System.out.println("Resultado: " + resultado);

		scanner.close();
	}
}