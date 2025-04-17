package br.com.dio.ui_custom.frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;

public class MainFrame extends JFrame {

    public MainFrame(final Dimension dimension, final JPanel mainPanel){
        super("Sudoku");
        this.setSize(dimension);
        this.setPreferredSize(dimension);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // setDefaultCloseOperation é o que fazer qd clicar no X
        this.setVisible(true);
        this.setLocationRelativeTo(null); // deoxamos ele centralizado na tela
        this.setResizable(false); // não permite redimensionar ele
        this.add(mainPanel);
    }
}
