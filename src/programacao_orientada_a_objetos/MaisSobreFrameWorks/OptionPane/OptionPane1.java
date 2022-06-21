package programacao_orientada_a_objetos.MaisSobreFrameWorks.OptionPane;

import javax.swing.*;
import java.net.URL;
public class OptionPane1 {

	public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        JOptionPane.showMessageDialog(null, "Seu cadastro foi realizado com sucesso!");

        JOptionPane.showMessageDialog(null, "Aten��o - e-mail n�o informado.", "Aten��o",
                JOptionPane.WARNING_MESSAGE);

        JOptionPane.showMessageDialog(null, "Favor informar o CPF", "Erro",
                JOptionPane.ERROR_MESSAGE);

        JOptionPane.showMessageDialog(null, "Obrigado", "Obrigado", JOptionPane.PLAIN_MESSAGE);

        URL url = OptionPane1.class.getResource("teste.png");
        Icon icone = new ImageIcon(url);

        JOptionPane.showMessageDialog(null, "Obrigado por escolher o SENAI", "SENAI",
                JOptionPane.INFORMATION_MESSAGE, icone);
    }
}