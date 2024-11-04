package com.mycompany.doble;

public class NodoDoble {
    public NodoDoble anterior;
    public NodoDoble siguiente;
    public String Dato;

    //CFonstructor para cuando ya hay nodos
    public NodoDoble(NodoDoble anterior, NodoDoble siguiente, String Dato) {
        this.anterior = anterior;
        this.siguiente = siguiente;
        this.Dato = Dato;
    }

    //Cosntructor para cuando hay datos
    public NodoDoble(String Dato) {
        this(null, null, Dato);
    }

    public NodoDoble() {
    }
    

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public String getDato() {
        return Dato;
    }

    public void setDato(String Dato) {
        this.Dato = Dato;
    }
    
    
}
