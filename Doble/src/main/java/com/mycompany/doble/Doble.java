package com.mycompany.doble;

import javax.swing.JOptionPane;

public class Doble {
    NodoDoble inicio;
    
    Doble(){
        inicio = null;
    }
    
    
    public boolean estaVacia(){
        return inicio == null;
    }
    
    
    public void insertarInicio(String dato){
        
        NodoDoble nuevo = new NodoDoble(dato);
        if (!estaVacia()) {
            nuevo.siguiente = inicio;
            inicio.anterior = nuevo;
        }
        inicio = nuevo;
        System.out.println("Insertado al inicio: " + dato);
    }
    
    public void imprimir(){
        if (!estaVacia()) {
            String concatenar = ""; 
            NodoDoble auxiliar = inicio; 
            while (auxiliar != null) {
                concatenar = concatenar + auxiliar.Dato + ", "; 
                System.out.println("Dato actual: " + auxiliar.Dato);
                auxiliar = auxiliar.siguiente; 
            }
            JOptionPane.showMessageDialog(null, concatenar); 
        }
    }
    
    public void insertarFinal(String dato){
        NodoDoble nuevo = new NodoDoble(dato);
        if (estaVacia()) {
            inicio = nuevo;
        } else {
            NodoDoble auxiliar = inicio;
        while (auxiliar.siguiente != null) {
            auxiliar = auxiliar.siguiente;
        }
        auxiliar.siguiente = nuevo;
        nuevo.anterior = auxiliar;
        }
        System.out.println("Insertado al final: " + dato);
    }
}
