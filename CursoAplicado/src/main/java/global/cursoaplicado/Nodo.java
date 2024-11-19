
package global.cursoaplicado;

public class Nodo {
    
    public String id;
    public String destinatario;
    public String direccion;
    public Nodo siguiente;

    public Nodo(String id, String destinatario, String direccion) {
        this.id = id;
        this.destinatario = destinatario;
        this.direccion = direccion;
        this.siguiente = null;
    }
}


