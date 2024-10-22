
package com.mycompany.ejemplo;

import java.util.LinkedList;
import java.util.Queue;

public class Ejemplo {

    public static void main(String[] args) {
        // Crear una cola
        Queue<String> lista = new LinkedList<>();

        // Agregar elementos a la cola
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        System.out.println("Elementos en la cola: " + lista);

        // Retirar elementos de la cola
        String firstElement = lista.poll();
        System.out.println("Elemento retirado: " + firstElement);
        System.out.println("Elementos restantes en la cola: " + lista);

        // Ver el siguiente elemento sin retirarlo
        String nextElement = lista.peek();
        System.out.println("Proximo elemento: " + nextElement);
    }
}
