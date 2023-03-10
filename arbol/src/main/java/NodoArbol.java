
public class NodoArbol {
    int dato;
    String nombre;
    NodoArbol hizquierdo, hiderecho;
    public NodoArbol( int d, String nom){
        this.dato=d;
        this.nombre=nom;
        this.hiderecho=null;
        this.hizquierdo=null;
    }
    public String toString(){
        return nombre+" el dato"+dato;
    }
}
