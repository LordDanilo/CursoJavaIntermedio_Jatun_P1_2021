import java.util.*;
public class EjemploPriorityQueue{
    private PriorityQueue<Integer> colaPrioridad;
    public EjemploPriorityQueue(){
        colaPrioridad = new PriorityQueue<Integer>();
    }
    public void agregar(Integer dato){
        colaPrioridad.offer(dato);
    }
    public Integer decolar(){
        return colaPrioridad.poll();
    }
}
