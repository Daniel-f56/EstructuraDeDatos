package com.mycompany.clase230924;

import javax.swing.JOptionPane;

public class ListaSimple {
    Nodo inicio;
    
    Listasimple(){
        inicio=null;
    }

    public void insertarInicio(String nombre, int edad, float promedio){
        Nodo nuevo = new Nodo();
        
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);
        
        if(inicio = null){
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
            
            inicio = nuevo;
        } else {
            nuevo.setEnlace(inicio);
            inicio = nuevo;
        }
    }
    
    public void consultar(){
        Nodo temporal = inicio;
        
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        } else {
            do{
                JOptionPane.showMessageDialog(null, "Nombre: "+temporal.getNombre()+temporal.getEdad()+temporal.getPromedio());
            }while(temporal.getEnlace()! = null);
        }
    }
}
