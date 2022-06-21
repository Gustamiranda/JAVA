package programacao_orientada_a_objetos.MaisSobreFrameWorks.OptionPane;

import javax.swing.*;
public class OptionPane1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

		JOptionPane.showMessageDialog(null, "Seu cadastro foi realizado com sucesso!");
	
		JOptionPane.showMessageDialog(null, "Atenção email não informado", "Atenção", JOptionPane.WARNING_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Favor informar oo CPF", "Erro", JOptionPane.ERROR_MESSAGE);
	
		JOptionPane.showMessageDialog(null, "Obrigado", "Obrigado", JOptionPane.PLAIN_MESSAGE);
	
		JOptionPane.showMessageDialog(null, "Obrigado por escolher o senai", "SENAI",);
	}

}
