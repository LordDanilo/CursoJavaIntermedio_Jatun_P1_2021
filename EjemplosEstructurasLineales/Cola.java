public class Cola<T>{
    private ListaEnlazada<T> cola;
    public Cola(){
        cola = new ListaEnlazada<T>();
    }
    public boolean offer(T dato){
        cola.add(dato);
        return true;
    }
    public T poll(){
        return cola.remove(0);
    }
}
