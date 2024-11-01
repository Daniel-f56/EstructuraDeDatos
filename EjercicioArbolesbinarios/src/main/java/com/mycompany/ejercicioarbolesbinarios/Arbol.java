package com.mycompany.ejercicioarbolesbinarios;

import javax.swing.JOptionPane;

public class Arbol {
    Nodo inicial;

    // Constructor
    public Arbol() {
        this.inicial = null;
    }

    //Metodo para insertar el arbol
    public void insertar() {
        String valor = JOptionPane.showInputDialog(null, "Ingrese la edad de la persona que va a ingresar");
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la persona que va a ingresar");
        String sexo = JOptionPane.showInputDialog(null, "Ingrese el sexo de la persona que va a ingresar");
        try {
            int numero = Integer.parseInt(valor);
            if (this.inicial == null) {
                this.inicial = new Nodo(new Persona(numero, nombre, sexo));
            } else {
                this.inicial.insertar(numero, nombre, sexo);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El dato que ingreso no es valido, por favor solamente ingrese numeros enteros");
        }
    }

    
    // Preorden: raíz -> izquierda -> derecha
    public String dispararPreorden() {
        return preorden(this.inicial).trim(); // Trim para evitar espacios o comas extra al final
    }

    public String preorden(Nodo nodo) {
        if (nodo == null) {
            return "";
        } else {
            String resultado = nodo.getValor() + ", ";
            resultado += preorden(nodo.getNodoIzq());
            resultado += preorden(nodo.getNodoDerecho());
            return resultado;
        }
    }

    
    // Inorden: izquierda -> raíz -> derecha
    public String dispararInorden() {
        return inorden(this.inicial).trim();
    }

    public String inorden(Nodo nodo) {
        if (nodo == null) {
            return "";
        } else {
            String resultado = inorden(nodo.getNodoIzq());
            resultado += nodo.getValor() + ", ";
            resultado += inorden(nodo.getNodoDerecho());
            return resultado;
        }
    }
    
    
    // Postorden: izquierda -> derecha -> raiz
    public String dispararPostorden() {
    return postorden(this.inicial);
}

    private String postorden(Nodo nodo) {
        if (nodo == null) {
            return ""; // Caso base
        } else {
            String resultado = postorden(nodo.getNodoIzq());
            resultado += postorden(nodo.getNodoDerecho());
            resultado += nodo.getValor() + ", ";
            return resultado;
        }
    }

}