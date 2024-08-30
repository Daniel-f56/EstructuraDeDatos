package com.mycompany.clase230824;

import javax.swing.JOptionPane;

public class Menu {
    String platos[];
    int datos[][];
    String dias[] = new String[]{"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
    Platos arrayObjetos[];
    
    //De aca para abajo el profe modifico el codigo
    public void crearMenu(int cantidad){
        arrayObjetos = new Platos[cantidad];
        platos = new String[cantidad];
        
        Platos obj = new Platos();
        
        int i = 0;
        while(i<cantidad){
            obj.setNombre(JOptionPane.showInputDialog("Diga el nombre del plato "+ (i+1)));
            obj.setPrecio(Integer.parseInt(JOptionPane.showInputDialog("Precio del plato")));
            
            arrayObjetos[i] = obj;
            i++;
        }
        
    }
    
    public void consultarMenu(){
        
        for(int i=0; i<platos.length; i++){
            JOptionPane.showMessageDialog(null, "Plato: "+arrayObjetos[i].getNombre() +"Precio: "+arrayObjetos[i].getPrecio());
        }
        
    }
    
    public void ingresarDatos(){
        
        datos = new int[6][platos.length];
        
        //for para recorrer la matriz
        for(int f=0; f<6; f++){
            for(int c=0;c<platos.length;c++){
                datos[f][c]=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las ventas del dia: "+dias[f]+" Plato: "+platos[c]));
            }
        }
    }
}
