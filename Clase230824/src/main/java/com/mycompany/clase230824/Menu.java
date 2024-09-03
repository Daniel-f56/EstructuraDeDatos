package com.mycompany.clase230824;

import javax.swing.JOptionPane;

public class Menu {
    
    int datos[][];
    String dias[] = new String[]{"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
    Platos arrayObjetos[];
    
    //De aca para abajo el profe modifico el codigo
    public void crearMenu(int cantidad){
        arrayObjetos = new Platos[cantidad];
        
        
        
        int i = 0;
        while(i<cantidad){
            
            String nombrePlato = JOptionPane.showInputDialog("Ingrese el nombre del plato " + (i+1));
            int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del plato " + nombrePlato));
            int produccion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo de proudccion de " + nombrePlato));
            
            arrayObjetos[i] = new Platos(precio,nombrePlato,produccion);
            i++;
        }
        
    }
    
    public void consultarMenu(){
        
        for (Platos arrayObjeto : arrayObjetos) {
            JOptionPane.showMessageDialog(null, "Plato: " + arrayObjeto.getNombre() + " Precio: " + arrayObjeto.getPrecio() + " Produccion: " + arrayObjeto.getProduccion());
        }
        
    }
    
    public void ingresarDatos(){
        
        datos = new int[6][arrayObjetos.length];
        
        //for para recorrer la matriz
        for(int f=0; f<6; f++){
            for(int c=0;c<arrayObjetos.length;c++){
                datos[f][c]=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las ventas del dia: "+dias[f]+" Plato: "+arrayObjetos[c].getNombre()));
            }
        }
    }
}
