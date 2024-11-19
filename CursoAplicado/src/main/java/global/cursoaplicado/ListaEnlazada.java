package global.cursoaplicado;

import global.cursoaplicado.Nodo;

class ListaEnlazada {
    
    private Nodo cabeza;

    public void agregar(String id, String destinatario, String direccion) {
        Nodo nuevo = new Nodo(id, destinatario, direccion);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public String mostrar() {
        StringBuilder detalles = new StringBuilder();
        Nodo actual = cabeza;
        while (actual != null) {
            detalles.append("ID: ").append(actual.id)
                    .append(", Destinatario: ").append(actual.destinatario)
                    .append(", Dirección: ").append(actual.direccion).append("\n");
            actual = actual.siguiente;
        }
        return detalles.toString();
    }
}

