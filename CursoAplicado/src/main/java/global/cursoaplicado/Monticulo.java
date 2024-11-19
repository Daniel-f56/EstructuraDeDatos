
package global.cursoaplicado;

import java.util.ArrayList;

public class Monticulo {
     private ArrayList<Paquete> heap;

    public Monticulo() {
        heap = new ArrayList<>();
    }

    public void insertar(Paquete paquete) {
        heap.add(paquete);
        subir(heap.size() - 1);
    }

    public Paquete extraerMin() {
        if (heap.isEmpty()) return null;
        Paquete min = heap.get(0);
        Paquete ultimo = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, ultimo);
            bajar(0);
        }
        return min;
    }

    private void subir(int index) {
        while (index > 0) {
            int padre = (index - 1) / 2;
            if (heap.get(index).prioridad < heap.get(padre).prioridad) {
                intercambiar(index, padre);
                index = padre;
            } else {
                break;
            }
        }
    }

    private void bajar(int index) {
        int tam = heap.size();
        while (index < tam) {
            int menor = index;
            int izquierda = 2 * index + 1;
            int derecha = 2 * index + 2;

            if (izquierda < tam && heap.get(izquierda).prioridad < heap.get(menor).prioridad) {
                menor = izquierda;
            }
            if (derecha < tam && heap.get(derecha).prioridad < heap.get(menor).prioridad) {
                menor = derecha;
            }
            if (menor != index) {
                intercambiar(index, menor);
                index = menor;
            } else {
                break;
            }
        }
    }

    private void intercambiar(int i, int j) {
        Paquete temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public String mostrarContenido() {
        StringBuilder detalles = new StringBuilder();
        for (Paquete paquete : heap) {
            detalles.append("Prioridad: ").append(paquete.prioridad).append("\n");
            detalles.append(paquete.detalles.mostrar()).append("\n");
        }
        return detalles.toString();
    }
}
