public class Nodo <T>{
    private T dato;
    private Nodo<T> sig;
    public Nodo(){
        dato = null;
        sig  = null;
    }
    public Nodo(T valorDato){
        dato = valorDato;
        sig  = new Nodo<T>();
    }
    public void setDato(T nuevoValor){
        dato = nuevoValor;
        if(sig == null){
            sig = new Nodo<T>();
        }
    }
    public T getValor(){
        return dato;
    }
    public Nodo<T> getSig(){
        return sig;
    }
    public boolean estaVacio(){
        return dato==null;
    }
    public void setSig(Nodo<T> nodo){
        sig = nodo;
    }
}
