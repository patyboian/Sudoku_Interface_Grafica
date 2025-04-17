package br.com.dio.ui_custom.button;

import javax.swing.JButton;
import java.awt.event.ActionListener;

public class CheckGameStatusButton extends JButton {

    public CheckGameStatusButton(final ActionListener actionListener){
        this.setText("Verificar jogo");
        this.addActionListener(actionListener); // ActionListener é a ação que ele vai executar
        // qd clicar no botão.
    }

}
