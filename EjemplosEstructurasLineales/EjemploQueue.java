import java.util.*;
public class EjemploQueue{
    private Queue<Integer> cola;
    public EjemploQueue(){
        cola = new LinkedList<Integer>();
    }
    public boolean agregar(int dato){
        return cola.offer(dato);
    }
    public Integer decolar(){
        return cola.poll();
    }
}
