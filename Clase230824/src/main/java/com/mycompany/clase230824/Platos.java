package com.mycompany.clase230824;

public class Platos {
    private int precio;
    private String nombre;
    private int produccion;

    public Platos(int precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public Platos() {
    }
    
    

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
