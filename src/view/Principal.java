package view;

import javax.swing.*;

public class Principal {
    private JPanel panelPrincipal;

    public static void main(String[] args) {
        JFrame frame = new JFrame("POO");
        frame.setContentPane(new Principal().panelPrincipal);
        frame.setVisible(true);
    }
}
