package EstruturasCondicionais;

import javax.swing.JOptionPane;

public class Exercicio8 {

	public static void main(String[] args) {

		double[] precos = new double[3];

		for (int c = 0; c < precos.length; c++) {

			JOptionPane.showMessageDialog(null, "Informe o preço do " + (c+1) + "° produto: ");
		}

	}

}
