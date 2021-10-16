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
    public String funcion(LinkedList<Integer> lista){
        String res = "";
        for(int i=0; i<lista.size(); i++){
            int act = lista.get(i);
            if(act%2==0){
                res = res+act+" ";
            }
        }
        return res;
    }
    public static void main(String args[]){
        EjemploLista var1 = new EjemploLista();
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(3);
        lista.add(23);
        lista.add(40);
        lista.add(22);
        lista.add(14);
        String res = var1.funcion(lista);
        System.out.print(res);
    }
}
