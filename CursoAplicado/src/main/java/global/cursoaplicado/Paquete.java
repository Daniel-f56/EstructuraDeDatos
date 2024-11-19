package global.cursoaplicado;

public class Paquete {
    
    public int prioridad;
    public ListaEnlazada detalles;

    public Paquete(int prioridad) {
        this.prioridad = prioridad;
        this.detalles = new ListaEnlazada();
    }
}
