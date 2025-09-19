# MainAgenda

# Agenda Personal en Java Swing

Una aplicación de escritorio desarrollada en **Java Swing** que permite gestionar una agenda personal simple.  
Con esta herramienta puedes **agregar, visualizar y eliminar eventos** con fecha, hora y descripción.  

---

##  Características principales

-  **Interfaz gráfica intuitiva** con `JFrame`, `JTable`, `JScrollPane` y `JPanel`.
-  **Ingreso de datos** mediante:
  - `JSpinner` para seleccionar **fecha** (dd/MM/yyyy).
  - `JSpinner` para seleccionar **hora** (HH:mm).
  - `JTextField` para la **descripción** del evento.
-  **Gestión de eventos**:
  - Agregar nuevos eventos con validaciones.
  - Eliminar un evento seleccionado con confirmación.
  - Visualizar todos los eventos en una tabla.
-  **Botones de acción**: Agregar, Eliminar, Salir.
-  **Organización del código** siguiendo el patrón **MVC**:
  - **Modelo (`Evento`)** → Representa un evento.
  - **Vista (`AgendaVista`)** → Construye la interfaz gráfica.
  - **Controlador (`AgendaControlador`)** → Lógica de validación y manejo de eventos.
  - **Main (`MainAgenda`)** → Punto de entrada de la aplicación.

---
