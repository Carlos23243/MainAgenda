/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainagenda;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */
public class AgendaControlador {
    private final AgendaVista vista;
    private final SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
    private final SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");

    public AgendaControlador(AgendaVista vista) {
        this.vista = vista;
        inicializarEventos();
    }

    private void inicializarEventos() {
        vista.getBtnAgregar().addActionListener(e -> agregarEvento());
        vista.getBtnEliminar().addActionListener(e -> eliminarEvento());
        vista.getBtnSalir().addActionListener(e -> vista.dispose());
    }

    private void agregarEvento() {
        String descripcion = vista.getTxtDescripcion().getText().trim();

        if (descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(vista,
                    "La descripción no puede estar vacía",
                    "Validación",
                    JOptionPane.WARNING_MESSAGE);
            vista.getTxtDescripcion().requestFocus();
            return;
        }

        Date fecha = (Date) vista.getSpinnerFecha().getValue();
        Date hora = (Date) vista.getSpinnerHora().getValue();

        // Usamos el modelo Evento
        Evento nuevoEvento = new Evento(fecha, hora, descripcion);

        vista.getModeloTabla().addRow(new Object[]{
                formatoFecha.format(nuevoEvento.getFecha()),
                formatoHora.format(nuevoEvento.getHora()),
                nuevoEvento.getDescripcion()
        });

        vista.getTxtDescripcion().setText("");
        vista.getTxtDescripcion().requestFocus();
    }

    private void eliminarEvento() {
        int fila = vista.getTablaEventos().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(vista,
                    "Selecciona un evento primero",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        int opcion = JOptionPane.showConfirmDialog(vista,
                "¿Eliminar el evento seleccionado?",
                "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            vista.getModeloTabla().removeRow(fila);
        }
    }
}

