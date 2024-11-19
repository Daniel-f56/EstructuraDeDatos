package global.cursoaplicado;

import javax.swing.JOptionPane;

public class ControladorMonticulo {
    private final Monticulo monticulo;

    public ControladorMonticulo() {
        this.monticulo = new Monticulo();
    }

    public void agregarPaquete() {
        try {
            
            int prioridad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la prioridad del paquete:"));
            Paquete paquete = new Paquete(prioridad);

            String id = JOptionPane.showInputDialog(null, "Ingrese el ID del paquete:");
            if (id == null || id.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El ID no puede estar vacío.");
                return;
            }

            if (!id.matches("\\d{1,6}")) {
                JOptionPane.showMessageDialog(null, "El ID debe ser un número de hasta 6 dígitos.");
                return;
            }

            String destinatario = JOptionPane.showInputDialog(null, "Ingrese el destinatario:");
            if (destinatario == null || destinatario.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El destinatario no puede estar vacío.");
                return;
            }

            String direccion = JOptionPane.showInputDialog(null, "Ingrese la dirección:");
            if (direccion == null || direccion.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "La dirección no puede estar vacía.");
                return;
            }

            paquete.detalles.agregar(id, destinatario, direccion);

            monticulo.insertar(paquete);
            JOptionPane.showMessageDialog(null, "Paquete agregado exitosamente.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido para la prioridad.");
        }
    }

    public void extraerPaquete() {
        Paquete paquete = monticulo.extraerMin();
        if (paquete == null) {
            JOptionPane.showMessageDialog(null, "No hay paquetes en el montículo.");
        } else {
            JOptionPane.showMessageDialog(null, "Paquete con prioridad " + paquete.prioridad + " extraído.");
        }
    }

    public void mostrarDetalles() {
        String contenido = monticulo.mostrarContenido();
        JOptionPane.showMessageDialog(null, contenido.isEmpty() ? "El montículo está vacío." : contenido);
    }
}
