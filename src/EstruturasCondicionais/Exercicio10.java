package EstruturasCondicionais;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {

		char turno = perguntarTurno();

		boolean turnoMatutino = retornarMatutino(turno);
		boolean turnoVespertino = retornarVespertino(turno);
		boolean turnoNoturno = retornarNoturno(turno);

		exibirTurno(turnoMatutino, turnoVespertino, turnoNoturno);

	}

	public static char perguntarTurno() {

		return JOptionPane.showInputDialog("Insira seu turno \nM-Matutino V-Vespertino N-Noturno").charAt(0);
	}

	public static boolean retornarMatutino(char turno) {

		return turno == 'M' || turno == 'm';
	}

	public static boolean retornarVespertino(char turno) {

		return turno == 'V' || turno == 'v';
	}

	public static boolean retornarNoturno(char turno) {

		return turno == 'N' || turno == 'n';
	}

	public static void exibirTurno(boolean turnoMatutino, boolean turnoVespertino, boolean turnoNoturno) {

		if (turnoMatutino) {
			JOptionPane.showMessageDialog(null, "Bom dia");
		} else if (turnoVespertino) {
			JOptionPane.showMessageDialog(null, "Boa tarde");
		} else if (turnoNoturno) {
			JOptionPane.showMessageDialog(null, "Boa noite");
		} else {
			JOptionPane.showMessageDialog(null, "Não");
		}

	}

}
