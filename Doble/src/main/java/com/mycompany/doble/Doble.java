package com.mycompany.doble;

import javax.swing.JOptionPane;

public class Doble {
    NodoDoble inicio;
    
    Doble(){
        inicio  = null;
    }
    
    public void insertarInicio(String dato){
        NodoDoble nuevo = new NodoDoble(); 
        
        nuevo.setAnterior(null);
        nuevo.setSiguiente(null);
        nuevo.setDato(dato);
        
        if(inicio==null){
            inicio=nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }
    
    public void imprimir(){
        NodoDoble temporal = inicio;
        
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "No hay nadie en la lista");
        } else {
            while(temporal!=null){
                JOptionPane.showMessageDialog(null, "Datos: "+temporal.getDato());
                temporal = temporal.getSiguiente();
            }
        }
    }
    
    public void insertarFinal(String dato){
        NodoDoble nuevo = new NodoDoble(); 
        
        nuevo.setAnterior(null);
        nuevo.setSiguiente(null);
        nuevo.setDato(dato);
        
        if(inicio!=null){
            inicio = nuevo;
            JOptionPane.showMessageDialog(null, "Lista creada");
        } else {
            NodoDoble temporal = inicio;
            while(temporal.getSiguiente()!=null){
                temporal = temporal.getSiguiente();
            }
            temporal.setSiguiente(nuevo);
            nuevo.setAnterior(temporal);
            nuevo.setSiguiente(null);
        }
    }
}
