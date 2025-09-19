import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class AgendaVista extends JFrame {

    private JTable tablaEventos;
    private DefaultTableModel modeloTabla;

    private JSpinner spinnerFecha;
    private JSpinner spinnerHora;
    private JTextField txtDescripcion;

    private JButton btnAgregar;
    private JButton btnEliminar;
    private JButton btnSalir;

    public AgendaVista() {
        setTitle("Agenda Personal");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout(10, 10));

        // --- Panel Entrada ---
        JPanel panelEntrada = new JPanel(new GridLayout(3, 2, 5, 5));

        spinnerFecha = new JSpinner(new SpinnerDateModel());
        spinnerFecha.setEditor(new JSpinner.DateEditor(spinnerFecha, "dd/MM/yyyy"));

        spinnerHora = new JSpinner(new SpinnerDateModel());
        spinnerHora.setEditor(new JSpinner.DateEditor(spinnerHora, "HH:mm"));

        txtDescripcion = new JTextField();

        panelEntrada.add(new JLabel("Fecha (dd/MM/yyyy):"));
        panelEntrada.add(spinnerFecha);
        panelEntrada.add(new JLabel("Hora (HH:mm):"));
        panelEntrada.add(spinnerHora);
        panelEntrada.add(new JLabel("Descripción:"));
        panelEntrada.add(txtDescripcion);

        add(panelEntrada, BorderLayout.NORTH);

        // --- Tabla ---
        modeloTabla = new DefaultTableModel(new Object[]{"Fecha", "Hora", "Descripción"}, 0);
        tablaEventos = new JTable(modeloTabla);
        JScrollPane scroll = new JScrollPane(tablaEventos);
        add(scroll, BorderLayout.CENTER);

        // --- Botones ---
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));

        btnAgregar = new JButton("Agregar");
        btnEliminar = new JButton("Eliminar seleccionado");
        btnSalir = new JButton("Salir");

        panelBotones.add(btnAgregar);
        panelBotones.add(btnEliminar);
        panelBotones.add(btnSalir);

        add(panelBotones, BorderLayout.SOUTH);
    }

    // Getters
    public JTable getTablaEventos() { return tablaEventos; }
    public DefaultTableModel getModeloTabla() { return modeloTabla; }
    public JSpinner getSpinnerFecha() { return spinnerFecha; }
    public JSpinner getSpinnerHora() { return spinnerHora; }
    public JTextField getTxtDescripcion() { return txtDescripcion; }
    public JButton getBtnAgregar() { return btnAgregar; }
    public JButton getBtnEliminar() { return btnEliminar; }
    public JButton getBtnSalir() { return btnSalir; }
}

