import java.util.ArrayList;
import java.util.LinkedList;
public class EjemploLista{
    // instance variables - replace the example below with your own
    private ArrayList<Integer> aux;
    private LinkedList<Integer> lista;
    public EjemploLista(){
        aux =  new ArrayList<>();
        lista = new LinkedList<>();
    }
    public void agregarDato(int dato){
        aux.add(dato);
    }
    public void agregarDatoLista(int dato){
        lista.add(dato);
    }
}
