package com.mycompany.mainagenda;

import javax.swing.*;

public class MainAgenda {

    private static AgendaControlador AgendaControlador;
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AgendaVista vista = new AgendaVista();
            AgendaControlador  = new AgendaControlador(vista);
            vista.setVisible(true);
        });
    }
}
