public class Cola<T>{
    protected ListaEnlazada<T> cola;
    public Cola(){
        cola = new ListaEnlazada<T>();
    }
    public void offer(T dato){
        cola.add(dato);
    }
    public T poll(){
        return cola.remove(0);
    }
}
