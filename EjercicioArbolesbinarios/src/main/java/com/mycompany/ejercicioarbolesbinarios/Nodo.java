package com.mycompany.ejercicioarbolesbinarios;

import javax.swing.JOptionPane;

public class Nodo {
    Persona persona;
    Nodo nodoIzq;
    Nodo nodoDerecho;

    public Nodo(Persona persona) {
        this.persona = persona;
        this.nodoDerecho = null;
        this.nodoIzq = null;
    }

    public String getValor() {
        String numero = String.valueOf(this.persona.getEdad());
        String result = "["+numero + " " +this.persona.getNombre() + " " +this.persona.getSexo()+"]";
        
        return result;
    }

    public void setValor(int valor) {
        this.persona.setEdad(valor);
    }

    public Nodo getNodoIzq() {
        return nodoIzq;
    }

    public Nodo getNodoDerecho() {
        return nodoDerecho;
    }

    //Funcion para agtregar un nodo a la derecha si es mayor y a la izquierda si es menor
    public void insertar(int _valor, String nombre, String sexo){
        //if para comprobar que el valor no se repita
        if(_valor == this.persona.getEdad()){
            JOptionPane.showMessageDialog(null, "Esa edad ya esta en el arbol");
            return;
        }
        
        //Edades menores que el inicial quedan a la derecha, mayores izquierda
        if(_valor >= 18){
            //Insertar en lado izquierdo
            if(this.nodoIzq == null){
                this.nodoIzq = new Nodo(new Persona(_valor, nombre, sexo));
            } else {
                this.nodoIzq.insertar(_valor, nombre, sexo);
            }
        } else {
            //Insertar en lado derecho
            if(this.nodoDerecho == null){
                this.nodoDerecho = new Nodo(new Persona(_valor, nombre, sexo));
            } else {
                this.nodoDerecho.insertar(_valor, nombre, sexo);
            }
        }
    }
}
