
public class ArbolBinario {
    NodoArbol raiz;
    public ArbolBinario(){
        raiz=null;
    }
    //insertar un nodo en el arbol
    public void agregarNodo(int d, String nom){
        NodoArbol nuevo =new NodoArbol(d, nom);
        if (raiz==null){
        raiz=nuevo;
    }else{
           NodoArbol a=raiz;
           NodoArbol padre;
           while(true){
             padre=a;
              if(d<a.dato){
                 if(a==null){
                    padre.hizquierdo=nuevo;
                     return;
                   }
              }else{
                    a=a.hiderecho;
                   if(a==null){
                    padre.hiderecho=nuevo;
                     return;
                }
            }
        }
    }
}//metodo in orden
    public void inOrden(NodoArbol r){
        if(r!=null){
            inOrden(r.hizquierdo);
            System.out.println(r.dato);
            inOrden(r.hiderecho);
        }
    }
    //metodo preorden 
    public void preOrden(NodoArbol r){
     if(r!=null){
    System.out.println(r.dato);
    preOrden(r.hizquierdo);
    preOrden(r.hiderecho);
}
}
    //metodo postOrden
     public void postOrden(NodoArbol r){
     if(r!=null){
    postOrden(r.hizquierdo);
    postOrden(r.hiderecho);
    System.out.println(r.dato);
}
}
}